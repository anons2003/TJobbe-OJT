package com.SWP.WebServer.repository;

import com.SWP.WebServer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUid(int id);
    User findByEmail(String email);
    User findByGid(String s_id);
    User findByEmailAndGid(String email, String s_id);
    User findByRoleType_RoleTypeId(int roleType);
    User findByEmailAndRoleType_RoleTypeId(String email, int roleTypeId);


}
