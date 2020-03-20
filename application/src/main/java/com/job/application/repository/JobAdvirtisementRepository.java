package com.job.application.repository;

import com.job.application.utils.JobAdvertisement;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobAdvirtisementRepository extends PagingAndSortingRepository<JobAdvertisement,Integer> {
}
