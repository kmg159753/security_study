package com.example.security_study.repository;

import com.example.security_study.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account,Long> {

    Account findByUsername(String userName);
}
