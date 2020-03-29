package br.com.amsj.aws.lambdahandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import br.com.amsj.aws.dto.UserDto;
import br.com.amsj.aws.dto.UserDtoInput;

public class LambdaHandlerObjectInput implements RequestHandler<UserDtoInput, UserDto> {
	
	
// br.com.amsj.aws.lambdahandler.LambdaHandlerObjectInput::handleRequest

/*
TO CALL
{
  "firstname": "John",
  "surname": "Crazy",
  "age": 10
}
*/
	
	
/*
TO VALIDATE	
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "title": "validateInput",
    "type": "object",
    "properties": {
        "firstname": {
            "type": "string"
        },
        "surname": {
            "type": "string"
        },
        "age": {
            "type": "integer"
        }
    },
    "required":[ "firstname" , "surname", "age" ]
}
*/

/*
TO TRANSFORM THE REQUEST
#set($inputRoot = $input.path('$'))
{
  "firstName" : "$inputRoot.firstname",
  "surname" : "$inputRoot.surname",
  "age" : "$inputRoot.age"
}
*/
	
	
/*
TO TRANSFORM THE RESPONSE	
#set($inputRoot = $input.path('$'))
{
  "fullName" : "$inputRoot.name $inputRoot.surname",
  "detail" : "$inputRoot.detail"
}
*/	
	

	@Override
	public UserDto handleRequest(UserDtoInput userDtoInput, Context context) {

		context.getLogger().log("userDtoInput --> " + userDtoInput);
		
		UserDto userDto = new UserDto();
		userDto.setName(userDtoInput.getFirstName());
		userDto.setSurname(userDtoInput.getSurname());
		
		if(userDtoInput.getAge() != null) {
			if(userDtoInput.getAge() >= 18) {
				userDto.setDetail("You are over 18");
			}else {
				userDto.setDetail("You are under 18");
			}
		}
		return userDto;
	}
}
