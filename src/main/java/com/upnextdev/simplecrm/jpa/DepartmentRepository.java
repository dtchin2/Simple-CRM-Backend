package com.upnextdev.simplecrm.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upnextdev.simplecrm.entity.CompanyEntity;
import com.upnextdev.simplecrm.entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer>{

}
