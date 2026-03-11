package com.pankaj.cabbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pankaj.cabbooking.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}