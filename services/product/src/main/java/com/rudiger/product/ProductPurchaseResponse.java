package com.rudiger.product;

import java.math.BigDecimal;

public record ProductPurchaseResponse(
        Integer id, String name, String description, BigDecimal price, double quantity
) {

}
