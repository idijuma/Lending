package com.lending.lending.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    private LocalDate date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "source_account_id_fk", nullable = false, updatable = false)
    private Account fromAccount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dest_account_id_fk", nullable = false, updatable = false)
    private Account toAccount;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_channel")
    private PaymentChannel transType;



}
