package com.company.springsecurityjdbc.dao;

import com.company.springsecurityjdbc.entity.Shop;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ShopDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Shop update(Shop shop){
        String query = "UPDATE public.shop\n" +
                "SET \"date\"=:date, name=:name\n" +
                "WHERE id=:id";

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        mapSqlParameterSource.addValue("date", shop.getDate());
        mapSqlParameterSource.addValue("name", shop.getName());
        mapSqlParameterSource.addValue("id", shop.getId());

        this.namedParameterJdbcTemplate.update(query, mapSqlParameterSource);

        return shop;
    }

    public void delete(Long id){
        String query = "DELETE FROM public.shop\n" +
                "WHERE id=:id";

        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource("id", id);
        this.namedParameterJdbcTemplate.update(query, mapSqlParameterSource);
    }

}
