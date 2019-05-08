package com.mn.demo.ExceptionHandler;

import com.mn.demo.bean.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ControllerAdvice
@Slf4j
public class ValidatorExceptionHandler
{
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public Result handle(MethodArgumentNotValidException e)
    {
        StringBuilder stringBuilder = new StringBuilder();
        {
            BindingResult bindingResult =  e.getBindingResult();
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            for (ObjectError objectError:allErrors)
            {
                String defaultMessage = objectError.getDefaultMessage();
                log.info(objectError.getDefaultMessage());
                stringBuilder.append(defaultMessage).append(";");
            }
        }
        Result result = new Result();
        result.setCode(400);
        result.setMsg(stringBuilder.toString());
        result.setData(null);
        return result;
    }

}
