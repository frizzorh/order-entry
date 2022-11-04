package com.foodco.ordermanagement;

import com.foodco.ordermanagement.domain.Order;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface OrderEntityResource extends PanacheEntityResource<Order, Long> {
}
