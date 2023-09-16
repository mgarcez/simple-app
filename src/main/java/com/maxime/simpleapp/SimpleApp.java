package com.maxime.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApp {

	/**
	 * 	You can run multiple instances of this Application API on different ports by configuring the
	 * 	application.properties file or using command-line arguments.
	 *
	 */
	public static void main(String[] args) {
		SpringApplication.run(SimpleApp.class, args);
	}
    /*
   curl -X POST -H "Content-Type: application/json" -d '{
  "game": "Mobile Legends",
  "gamerID": "GYUTDTE",
  "points": 20
}' http://localhost:8080/api/endpoint

    curl -X POST -H "Content-Type: application/json" -d '{
}' http://localhost:8080/api/endpoint

while true
do
    curl -X POST -H "Content-Type: application/json" -d '{}' http://localhost:8080/api/router
    echo " "
done
     */


}



