package com.job.application.utils;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "JobAdvertisement")
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    @NotEmpty(message = "You should provide a job title")
    private String jobTitle;

    @Column
    @NotEmpty(message = "You should provide a job description")
    private String jobDescription;

    @Column
    @NotEmpty(message = "You should provide a input on how many people to hire")
    private int numOfPeopleToHire;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date expirationDate;


    public JobAdvertisement(@NotEmpty(message = "You should provide a job title") String jobTitle,
                            @NotEmpty(message = "You should provide a job description") String jobDescription,
                            @NotEmpty(message = "You should provide a input on how many people to hire") int numOfPeopleToHire,
                            @NotEmpty(message = "You should provide a expiration date") Date expirationDate) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.numOfPeopleToHire = numOfPeopleToHire;
        this.expirationDate = expirationDate;
    }

    public JobAdvertisement() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public int getNumOfPeopleToHire() {
        return numOfPeopleToHire;
    }

    public void setNumOfPeopleToHire(int numOfPeopleToHire) {
        this.numOfPeopleToHire = numOfPeopleToHire;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
