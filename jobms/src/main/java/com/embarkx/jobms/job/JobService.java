package com.embarkx.jobms.job;

import com.embarkx.jobms.job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();
    void createJob(Job job);

    JobDTO getJobById(Long id);

    Boolean deleteJobById(Long id);

    boolean updateJobById(Long id, Job updatedJob);
}
