package com.rakyooooo.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakyooooo.restapi.entity.UserInfoEntity;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {

}
