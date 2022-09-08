package com.dsoftware.meta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsoftware.meta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
