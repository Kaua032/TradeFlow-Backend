package com.tradeflow.repository;

import com.tradeflow.model.Order;
import com.tradeflow.model.Asset;
import com.tradeflow.model.enums.OrderStatus;
import com.tradeflow.model.enums.OrderType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByAssetAndStatusAndTypeOrderByCreatedAtAsc(
            Asset asset, OrderStatus status, OrderType type
    );
}