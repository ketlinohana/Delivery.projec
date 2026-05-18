package com.deliverytech_fat.deliveryapi.repository;

import com.deliverytech_fat.deliveryapi.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
