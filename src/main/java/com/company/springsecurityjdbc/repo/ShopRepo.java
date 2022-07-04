package com.company.springsecurityjdbc.repo;

import com.company.springsecurityjdbc.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShopRepo extends JpaRepository<Shop, Long> {
//    Optional<Shop> findById(Long id);
}
