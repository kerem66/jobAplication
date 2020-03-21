package com.job.application.service;

import com.job.application.utils.HrManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrManagerService {
    List<HrManagerService> getManagers();
    ResponseEntity<?> addHrManager(HrManager hrManager);
    ResponseEntity<?> getHrManagerByEmail(String email);


}
