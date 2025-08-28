package com.aletonarqui.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aletonarqui.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
