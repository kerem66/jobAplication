package com.job.application.controller;

import com.job.application.service.impl.HrManagerServiceImpl;
import com.job.application.utils.HrManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HrManagerController {

    @Autowired
    HrManagerServiceImpl hrManagerService;

    @PostMapping
    public ResponseEntity<?> addHrManager(@RequestBody HrManager hrManager){
        return hrManagerService.addHrManager(hrManager);
    }
}
