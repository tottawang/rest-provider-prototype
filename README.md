# rest-provider-prototype

### Run and build
Step-1 : 
./gradlew clean build

Step-2 :
java -jar build/libs/sample-0.0.1-SNAPSHOT.jar

### Test
Run curl http://localhost:{your_sever_port}/api/provider
Printed the domain object PrototypeSample itself that we can see new instance is used every time.
