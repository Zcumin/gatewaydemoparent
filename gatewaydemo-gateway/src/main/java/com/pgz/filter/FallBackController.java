package com.pgz.filter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
    @RequestMapping("/user/fallback")
    public ResponseEntity<Object> fallback() {
        return ResponseEntity.ok("熔断");
    }
}