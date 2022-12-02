package com.mgd.sports.motogp.infraestructure.repository;

import com.mgd.sports.motogp.infraestructure.entities.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository <DriverEntity, Long> {
}
