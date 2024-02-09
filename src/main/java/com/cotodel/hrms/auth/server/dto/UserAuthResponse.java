package com.cotodel.hrms.auth.server.dto;

import com.cotodel.hrms.auth.server.model.employer.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthResponse {
	
	  private boolean verifyStatus;
	  private String timestamp;
	  private String authToken;
	  private UserEntity userEntity;
}
