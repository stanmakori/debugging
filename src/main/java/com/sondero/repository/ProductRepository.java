package com.sondero.repository;

import com.sondero.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
   // Product findBySupplierCode(String supplierCode);
}
