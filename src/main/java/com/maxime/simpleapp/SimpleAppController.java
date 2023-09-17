package com.maxime.simpleapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SimpleAppController {

    @PostMapping("/endpoint")
    public ResponseEntity<Object> handleRequest(@RequestBody Map<String, Object> requestData) throws InterruptedException {
        //Thread.sleep(500000);
        // Process the request data
        return ResponseEntity.ok(requestData);
    }
}
