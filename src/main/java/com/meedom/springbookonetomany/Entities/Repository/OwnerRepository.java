package com.meedom.springbookonetomany.Entities.Repository;

import com.meedom.springbookonetomany.Entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
}