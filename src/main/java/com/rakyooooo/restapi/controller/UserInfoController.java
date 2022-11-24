package com.rakyooooo.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakyooooo.restapi.entity.UserInfoEntity;
import com.rakyooooo.restapi.repository.UserInfoRepository;

@RestController
@RequestMapping("/user")
public class UserInfoController {
	@Autowired
	private UserInfoRepository userInfoRepository;

	@GetMapping("/findAll")
	public List<UserInfoEntity> findAllketsui() {
		List<UserInfoEntity> ret = userInfoRepository.findAll();
		return ret;
	}

	@PostMapping
	public UserInfoEntity postKetsui(@RequestBody UserInfoEntity insertEntity) {
		UserInfoEntity ret = userInfoRepository.save(insertEntity);
		return ret;
	}
}
