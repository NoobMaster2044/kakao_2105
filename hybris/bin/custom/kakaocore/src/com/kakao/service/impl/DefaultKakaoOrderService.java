package com.kakao.service.impl;

import com.kakao.dao.impl.KakaoOrderDao;
import com.kakao.service.KakaoOrderService;
import de.hybris.platform.core.model.order.OrderModel;

import java.util.List;

public class DefaultKakaoOrderService implements KakaoOrderService {

    private KakaoOrderDao kakaoOrderDao;

    @Override
    public List<OrderModel> getOrdersPlacedThisHour() {
        return kakaoOrderDao.findOrdersPlacedThisHour();
    }

    public void setKakaoOrderDao(KakaoOrderDao kakaoOrderDao) {
        this.kakaoOrderDao = kakaoOrderDao;
    }
}
