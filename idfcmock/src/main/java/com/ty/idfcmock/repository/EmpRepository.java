package com.ty.idfcmock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ty.idfcmock.dto.EmpDto;
@Repository
public interface EmpRepository extends JpaRepository<EmpDto, Integer>{

}
