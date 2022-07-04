package com.company.springsecurityjdbc.controller;

import com.company.springsecurityjdbc.dto.ShopDto;
import com.company.springsecurityjdbc.entity.Shop;
import com.company.springsecurityjdbc.service.serviceImplementation.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.xml.ws.Response;
import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/shop")
public class ShopController {

    private final ShopService service;

    @PostMapping("/save")
    public ResponseEntity<Shop> saveShop(
            @RequestBody ShopDto.SaveRequest shop
    ) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/shop/save").toUriString());
        return ResponseEntity.created(uri).body(service.saveShop(shop));
    }

    @GetMapping("/fetch/all")
    public ResponseEntity<List<Shop>> listShop(){
        return ResponseEntity.ok(service.getShops());
    }

    @PostMapping("/update")
    public ResponseEntity<Shop> updateShop(
            @RequestBody Shop shop
    ){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/shop/update").toUriString());
        return ResponseEntity.created(uri).body(service.update(shop));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(
            @PathVariable Long id
    ) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
