package com.upnextdev.simplecrm.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upnextdev.simplecrm.entity.TeamMemberEntity;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMemberEntity, Integer> {

}
