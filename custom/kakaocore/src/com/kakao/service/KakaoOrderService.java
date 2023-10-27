package com.kakao.service;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.List;

public interface KakaoOrderService {
    List<OrderModel> getOrdersPlacedThisHour();
}
