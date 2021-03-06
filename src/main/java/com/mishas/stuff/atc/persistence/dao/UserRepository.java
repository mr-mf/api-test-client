package com.mishas.stuff.atc.persistence.dao;

import com.mishas.stuff.atc.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
