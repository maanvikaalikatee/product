package com.product.items.repository;

import com.product.items.entity.ItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemsEntity,Long> {


}
