package com.marcos.springcloud.mscv.items.services;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.marcos.springcloud.mscv.items.clients.ProductFeignClient;
import com.marcos.springcloud.mscv.items.models.Item;
import com.marcos.springcloud.mscv.items.models.Product;

public class ItemServiceFeign implements ItemService{

    @Autowired
    private ProductFeignClient client;

    @Override
    public List<Item> findAll() {
        return client.findAll()
            .stream()
            .map(product -> new Item(product, new Random().nextInt(10) + 1))
        .collect(Collectors.toList());
    }

    @Override
    public Optional<Item> findById(Long id) {
        Product product = client.details(id);
        if (product == null){
            return Optional.empty();
        }
        return Optional.ofNullable(new Item(product, new Random().nextInt(10) + 1));
    }

}
