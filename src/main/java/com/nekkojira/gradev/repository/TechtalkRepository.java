package com.nekkojira.gradev.repository;

import com.nekkojira.gradev.domain.Techtalk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechtalkRepository extends JpaRepository<Techtalk, String> {
}
