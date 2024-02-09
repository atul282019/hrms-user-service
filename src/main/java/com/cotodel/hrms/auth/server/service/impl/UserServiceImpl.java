package com.cotodel.hrms.auth.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONObject;
import com.cotodel.hrms.auth.server.model.employer.entity.UserEntity;
import com.cotodel.hrms.auth.server.properties.ApplicationConstantConfig;
import com.cotodel.hrms.auth.server.repository.UserRepository;
import com.cotodel.hrms.auth.server.service.UserService;
import com.cotodel.hrms.auth.server.util.CommonUtility;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public ApplicationConstantConfig applicationConstantConfig;	
	
	@Autowired
	UserRepository   userRepository;
	
	@Override
	public UserEntity getByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.getByUserName(userName);
	}

	@Override
	public String verifyToken(String authToken) {
		return CommonUtility.userRequest(null,verifyRequest(authToken),applicationConstantConfig.VERIFY_TOKEN);
		
	}
	public  String verifyRequest(String authToken){
		JSONObject data= new JSONObject();
		data.put("authToken", authToken);
		return data.toString();
	}
	
	@Override
	public String getToken(String comId) {
		return CommonUtility.getTokenRequest(null,"",comId,applicationConstantConfig.GET_TOKEN);
		
	}
	
}
