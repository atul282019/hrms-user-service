package com.cotodel.hrms.auth.server.service;

import com.cotodel.hrms.auth.server.model.employer.entity.UserEntity;

public interface UserService {
	 public UserEntity getByUserName(String userName);

}
