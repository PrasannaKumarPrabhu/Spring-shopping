package com.shopping.orderservice.dto;

import com.shopping.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemsDto {
    private Long id;
    private String orderNumber;
    private List<OrderLineItems> orderLineItemsList;
}
