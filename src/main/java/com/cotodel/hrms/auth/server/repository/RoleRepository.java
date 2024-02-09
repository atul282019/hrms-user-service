package com.cotodel.hrms.auth.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cotodel.hrms.auth.server.model.employer.entity.RoleMaster;
@Repository
public interface RoleRepository extends  JpaRepository<RoleMaster, Long> {
	

	  @Query("select s  from RoleMaster s where  s.status=1")
	  public List<RoleMaster> getAllList();
	 
	  

}
