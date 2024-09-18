package com.usemanagement.repository;

import com.usemanagement.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<CountryEntity , Integer> {
}
