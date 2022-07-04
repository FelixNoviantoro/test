package com.company.springsecurityjdbc.service.serviceImplementation;

import com.company.springsecurityjdbc.dao.ShopDao;
import com.company.springsecurityjdbc.dto.ShopDto;
import com.company.springsecurityjdbc.entity.Shop;
import com.company.springsecurityjdbc.repo.ShopRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ShopService {

    private final ShopRepo shopRepo;
    private final ShopDao dao;

    public Shop saveShop(ShopDto.SaveRequest value){
        log.info("Save Shop");
        return shopRepo.save(value.getShopping());
    }

    public List<Shop> getShops(){
        log.info("Fetching all Shop");
        return shopRepo.findAll();
    }

    public Shop update(Shop shop){
        log.info("Update data Shop");
        return dao.update(shop);
    }

    public void delete(Long id){
        log.info("Update data Shop");
        dao.delete(id);
    }
}
