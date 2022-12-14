package com.lending.lending.repositories;

import com.lending.lending.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Override
    List<Account> findAll();

    @Override
    Page<Account> findAll(Pageable pageable);

}
