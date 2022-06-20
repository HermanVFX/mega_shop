package com.amr.project.dao.abstracts;

import com.amr.project.model.entity.Shop;

import java.util.List;

public interface ShopDao extends ReadWriteDao<Shop, Long> {

    List<Shop> findAllShopForUser();

    List<Shop> findShopsBySearchRequest(String query);
}
