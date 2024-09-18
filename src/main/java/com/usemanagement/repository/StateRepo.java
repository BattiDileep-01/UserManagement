package com.usemanagement.repository;

import com.usemanagement.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepo extends JpaRepository<StateEntity , Integer> {
}
