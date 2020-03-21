package com.job.application.service.impl;

import com.job.application.repository.HrManagerRepository;
import com.job.application.service.HrManagerService;
import com.job.application.utils.HrManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrManagerServiceImpl implements HrManagerService {

    @Autowired
    HrManagerRepository hrManagerRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<HrManagerService> getManagers() {
        return null;
    }

    @Override
    public ResponseEntity<?> addHrManager(HrManager hrManager) {
        if(hrManager!=null){
            if(!hrManagerRepository.existsByEmail(hrManager.getEmail())){
                HrManager tempManager=new HrManager(hrManager.getEmail(),
                                                    passwordEncoder.encode(hrManager.getPassword()),
                                                    hrManager.getFirstname(),
                                                    hrManager.getLastname(),
                                                    hrManager.getRole()
                                                    );
                hrManagerRepository.save(tempManager);
                return new ResponseEntity<>("HrManager saved",HttpStatus.OK);
            }else {
                return new ResponseEntity<>("Email exists",HttpStatus.CONFLICT);
            }
        }else {
            return new ResponseEntity<>("hr manager input is null", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<?> getHrManagerByEmail(String email) {
        if(hrManagerRepository.existsByEmail(email)){
            return new ResponseEntity<>(hrManagerRepository.findByEmail(email),HttpStatus.OK);
        }
        return new ResponseEntity<>("No such email",HttpStatus.NOT_FOUND);
    }
}
