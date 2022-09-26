package com.bugtrack1C.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bugtrack1C.entity.MemberEntity;

public interface IMemberRepository extends CrudRepository<MemberEntity, Long> {
	
	@Override
	public List<MemberEntity> findAll();
}
