package com.example.jpa.Repository;

import com.example.jpa.entities.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<order,Long> {

}
