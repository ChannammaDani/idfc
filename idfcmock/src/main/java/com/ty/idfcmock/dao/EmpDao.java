package com.ty.idfcmock.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ty.idfcmock.dto.EmpDto;
import com.ty.idfcmock.repository.EmpRepository;

@Component

public class EmpDao {

	@Autowired
	EmpRepository repository;
	
	public void insert(EmpDto dto) {
		repository.save(dto);
	}
	
	public String delete(EmpDto dto) {
		repository.delete(dto);
		return "data deleted";
	}
	
	public EmpDto fetch(EmpDto dto) {
		Optional<EmpDto> dto2 = repository.findById(dto.getId());
		return dto2.get();
		
	}
	
}
