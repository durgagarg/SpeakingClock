# SpeakingClock

Specification
-------------
1. Given a 24-hour clock convert the current time into words e.g. &quot;08:34&quot; should be converted
to &quot;It&#39;s eight thirty four&quot;
2. Make another controller to handle input from user in the format “11:25”
3. Return Midday and Midnight as &quot;It&#39;s Midday&quot; and &quot;It&#39;s Midnight&quot;

The time allotted to the test is 1 hour. Your solution will be judged on a number of criteria pertinent
to good software development practice. Incomplete solutions are acceptable.
For the purposes of this exercise, please use Java 8 libraries.
NOTES :
- Use JDK 8 or above
- Swagger implementation is preferable.
- Maven/Gradle projects only. MVN projects should build with “mvn clean install” command
- ReadMe file should contain build and deployment related information
- Use microservice architecture, exception handling and unit test cases should be present

Requirements
------------
- Java1.8
- SpringBoot 2.3.5.RELEASE
- Junit4
- Apache Maven 3.6.3 

Build & Deployments
------------------
install Open JDK1.8
setup Apache Maven 3.6.3
mvn clean Install 
mvn spring-boot:run
click http://localhost:8085/api/clock/12:00 to test
