package com.marcos.springcloud.mscv.items.services;

import java.util.List;
import java.util.Optional;

import com.marcos.springcloud.mscv.items.models.Item;

public interface ItemService {

    List<Item> findAll();

    Optional<Item> findById(Long id);

}
