package com.github.jifwei.app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.github.jifwei.app.domain.model.ItemType;
import com.github.jifwei.app.domain.model.StockItem;

public interface StockItemRepository extends CrudRepository<StockItem, Long> {
    List<StockItem> findByType(ItemType type);
}