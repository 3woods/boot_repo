package com.woods.boot_repo.mapper;

import java.util.List;

import com.woods.boot_repo.entity.UserEntity;

public interface UserMapper {
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}