package com.job.application.repository;

import com.job.application.utils.HrManager;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HrManagerRepository extends PagingAndSortingRepository<HrManager,Integer> {
    boolean existsByEmail(String email);
    Optional<HrManager> findByEmail(String email);
}
