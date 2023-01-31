package com.dh.jakartapersistance.repository;

import com.dh.jakartapersistance.model.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends ListCrudRepository<Product, UUID> {

}
