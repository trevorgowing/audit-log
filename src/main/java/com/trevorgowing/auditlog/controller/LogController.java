package com.trevorgowing.auditlog.controller;

import com.trevorgowing.auditlog.domain.web.CreateLogRequest;
import com.trevorgowing.auditlog.domain.web.LogCreatedResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class LogController {

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public LogCreatedResponse createLog(@RequestBody CreateLogRequest createLogRequest) {
        return null;
    }
}
