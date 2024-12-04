package com.SWP.WebServer.dto;

public class MonthlyJobPostDTO {

    private Integer month;  // Tháng (1-12)
    private Long jobCount;  // Số lượng công việc đã đăng trong tháng

    // Constructor
    public MonthlyJobPostDTO(Integer month, Long jobCount) {
        this.month = month;
        this.jobCount = jobCount;
    }

    // Getters và Setters
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Long getJobCount() {
        return jobCount;
    }

    public void setJobCount(Long jobCount) {
        this.jobCount = jobCount;
    }
}
