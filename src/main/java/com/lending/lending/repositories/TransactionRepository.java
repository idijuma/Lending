package com.lending.lending.repositories;
import com.lending.lending.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
    @Override
    List<Transaction> findAll();

    @Override
    Page<Transaction> findAll(Pageable pageable);

}
