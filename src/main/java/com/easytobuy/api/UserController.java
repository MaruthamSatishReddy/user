package com.easytobuy.api;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {

    @GetMapping("/status")
    public ResponseEntity<String> getApplicationStatus(){
        return new ResponseEntity<>("USER-SERVICE IS UP",HttpStatus.OK);
    }
}
