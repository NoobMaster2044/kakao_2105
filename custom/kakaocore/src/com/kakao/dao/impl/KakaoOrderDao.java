package com.kakao.dao.impl;

import de.hybris.platform.core.model.order.OrderModel;

import java.util.List;

public interface KakaoOrderDao {
    List<OrderModel> findOrdersPlacedThisHour();
}
