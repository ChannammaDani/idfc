package com.ty.idfcmock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.idfcmock.dao.EmpDao;
import com.ty.idfcmock.dto.EmpDto;


@RestController
public class EmpController {

	
	@Autowired
	EmpDao dao;
	
	@PostMapping("/insert")
	public void insert(@RequestBody EmpDto dto) {
		dao.insert(dto);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestBody EmpDto dto) {
		String a = dao.delete(dto);
		return a;
	}
	
	@GetMapping("/fetch")
	public EmpDto fetch(@RequestBody EmpDto dto) {
		EmpDto b = dao.fetch(dto);
		return b;
	}
}
