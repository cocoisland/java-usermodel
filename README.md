# Exception, Logging, Actuator

## Exception
To control the quantity and quality of message(debug,trace,info,error) being
display in console, logs or client display.

1. Create model/ErrorDetail object.
2. Create exception/ValidationError exception object.
3. Create handlers/RestExceptionHandler
	* handle EntityNotFoundException from services/UserServiceImpl.java, replacing default messages with ErrorDetail object messages.
4. Create exception/ResourceFoundException to replace UserServiceImpl/save.
	* Create unique serialVersionUID. Each serializeable object must have unique serialized version UID. The first serialized object is default serialized
UID, then any next serialized object must be explicitly UID, eg 1L, 2L, 3L etc.
5. To take control of exception from spring boot, so that custom exception can be handled,
	* Turn off spring boot automatic exception handler.
	 	application.properties -> server.error.whitelabel.enabled=false
	* turn on EnableWebMvc in UserModelApplication
	* get dispatcherServlet to throw exception if no handler is found from 
UserModelApplication.



## Actuator - performance monitoring ports
1. add actuator dependency in pom.xml
	* default on, but not readable unless specifically enabled in endpoints.
2. application.properties -> management.endpoints 
3. actuator port
	* localhost:2019/actuator
	* localhost:2019/actuator/health

## Logging (level- Trace, Debug, Info, Warn, Error, Off)
1. add slf4j dependency in pom.xml
2. create logback-spring.xml  // if existed, spring will use it to format output.
3. called LoggerFactory logger in UserController to initial logging message.


