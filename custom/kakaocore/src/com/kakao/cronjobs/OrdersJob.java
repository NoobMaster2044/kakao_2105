package com.kakao.cronjobs;

import com.kakao.service.KakaoOrderService;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

public class OrdersJob extends AbstractJobPerformable<CronJobModel> {

    private KakaoOrderService kakaoOrderService;

    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        if (kakaoOrderService.getOrdersPlacedThisHour() == null) {
            System.out.println("En la ultima hora no se vendio nada");
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public void setKakaoOrderService(KakaoOrderService kakaoOrderService) {
        this.kakaoOrderService = kakaoOrderService;
    }
}
