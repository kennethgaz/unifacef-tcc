package com.unifacef.tcc.repository;

import com.unifacef.tcc.model.DeveloperSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface DeveloperSkillRepository extends JpaRepository<DeveloperSkill, DeveloperSkill.DeveloperSkillId> {
  ArrayList<DeveloperSkill> findByDeveloperId(Integer developerId);
}
