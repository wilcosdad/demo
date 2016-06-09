package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by brian on 6/7/16.
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    Optional<Account> findByUsername(String username);
}
