// JobRepository.java
package com.SWP.WebServer.repository;

import com.SWP.WebServer.dto.MonthlyJobPostDTO;
import com.SWP.WebServer.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface JobPostRepository extends JpaRepository<Job, Long> {
    List<Job> findByEnterprise_Eid(int eid);

    List<Job> findByEnterprise_User_Uid(int i);

    List<Job> findByIsActiveTrueOrderByCreatedDateDesc();


    @Query("SELECT new com.SWP.WebServer.dto.MonthlyJobPostDTO(MONTH(j.createdDate), COUNT(j.id)) " +
            "FROM Job j " +
            "WHERE YEAR(j.createdDate) = :year AND j.isActive = true " +
            "GROUP BY MONTH(j.createdDate) " +
            "ORDER BY MONTH(j.createdDate)")
    List<MonthlyJobPostDTO> findJobPostsCountByYear(@Param("year") int year);




}
