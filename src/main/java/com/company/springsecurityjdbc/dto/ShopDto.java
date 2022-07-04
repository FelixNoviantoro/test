package com.company.springsecurityjdbc.dto;

import com.company.springsecurityjdbc.entity.Shop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ShopDto {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SaveRequest{
        private Shop shopping;
    }
}
