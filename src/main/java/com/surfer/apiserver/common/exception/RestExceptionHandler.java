package com.surfer.apiserver.common.exception;

import com.surfer.apiserver.common.response.ApiResponseCode;
import com.surfer.apiserver.common.response.BaseResponse;
import com.surfer.apiserver.common.response.RestApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
@Slf4j
public class RestExceptionHandler {
    @ExceptionHandler(value = BusinessException.class)
    public ResponseEntity<?> handleBusinessException(BusinessException e) {
        RestApiResponse responseDTO = new RestApiResponse();
        responseDTO.setResult(new BaseResponse(e.getResponseCode(), e.getDetail()));
        return new ResponseEntity<RestApiResponse>(responseDTO, e.getStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String errorMessage = e.getBindingResult()
                .getAllErrors()
                .get(0)
                .getDefaultMessage();
        log.error(errorMessage);
        RestApiResponse responseDTO = new RestApiResponse();
        responseDTO.setResult(new BaseResponse(ApiResponseCode.INVALID_PARAMETER_ERR, errorMessage));
        return new ResponseEntity<RestApiResponse>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<?> handleOracleDataBaseException(DataIntegrityViolationException e) {
        RestApiResponse responseDTO = new RestApiResponse();
        if (e.getMessage().contains("ORA-00001")) {
            responseDTO.setResult(new BaseResponse(ApiResponseCode.UNIQUE_CONSTRAINT_VIOLATED, e.getMessage()));
        }
        responseDTO.setResult(new BaseResponse(ApiResponseCode.UNKNOWN_DATABASE_EXCEPTION, e.getMessage()));
        return new ResponseEntity<RestApiResponse>(responseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<?> no(HttpMediaTypeNotSupportedException e) {
        RestApiResponse responseDTO = new RestApiResponse();
        responseDTO.setResult(new BaseResponse(ApiResponseCode.UNACCEPTED_REQUEST, e.getMessage()));
        return new ResponseEntity<RestApiResponse>(responseDTO, HttpStatus.BAD_REQUEST);
    }


}