# awslambdaexample

Example for run a Java 8 AWS Lambda function

To compile an create a .jar to deploy in AWS Lambda Functions:

$ mvn install

There are 2 handles available to run:
LambdaHandlerObjectInput and LambdaHandlerHelloWorld

## To configure the handlers:

### LambdaHandlerObjectInput:
handler name:
br.com.amsj.aws.lambdahandler.LambdaHandlerObjectInput::handleRequest

to test:
{
"firstname": "John",
"surname": "Crazy",
"age": 10
}

### LambdaHandlerHelloWorld
handler namne:
br.com.amsj.aws.lambdahandler.LambdaHandlerHelloWorld::handleRequest

to test:
{
"firstname": "John",
"surname": "Crazy",
"age": 10
}
