package br.com.amsj.aws.lambdahandler;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.amsj.aws.dto.ResponseErrorDto;
import br.com.amsj.aws.dto.UserDto;

public class LambdaHandlerHelloWorld implements RequestHandler<Map<String,Object>, String> {

// br.com.amsj.aws.lambdahandler.LambdaHandlerHelloWorld::handleRequest
	
	@Override
	public String handleRequest(Map<String,Object> input, Context context) {
		
		context.getLogger().log("input --> " + input);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		UserDto userDto = null;
		userDto = objectMapper.convertValue(input, UserDto.class);
		userDto.setDetail("Hello World Success!");
		
		
		String result = null;
		try {
			result = objectMapper.writeValueAsString(userDto);
		} catch (JsonProcessingException e) {
			context.getLogger().log("Error to write an UserDto");
			context.getLogger().log(e.getMessage());
			e.printStackTrace();
			return getErrorResponse(context);
		}
		
		return result;
	}
	
	private String getErrorResponse(Context context) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		String errorResult = null;
		
		try {
			errorResult = objectMapper.writeValueAsString(new ResponseErrorDto());
		} catch (JsonProcessingException e) {
			context.getLogger().log(e.getMessage());
			e.printStackTrace();
		}
		return errorResult;
	}

}
