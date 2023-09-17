# simple-app
Simple APPLICATION API with one endpoint which accepts an HTTP POST with any JSON payload. The API will respond with a success response containing an exact copy of the JSON request it received. 

## Usage

```shell
# Compile
mvn clean install

# Start the server
mvn spring-boot:run

Step 3: Send POST requests
   curl -X POST -H "Content-Type: application/json" -d '{
  "game": "Mobile Legends",
  "gamerID": "GYUTDTE",
  "points": 20
}' http://localhost:8080/api/endpoint
```

You can run multiple instances of this Application API on different ports by configuring the application.properties file or using command-line arguments.
```shell
mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=5003"
```