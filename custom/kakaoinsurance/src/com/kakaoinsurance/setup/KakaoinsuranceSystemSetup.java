/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.kakaoinsurance.setup;

import static com.kakaoinsurance.constants.KakaoinsuranceConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.kakaoinsurance.constants.KakaoinsuranceConstants;
import com.kakaoinsurance.service.KakaoinsuranceService;


@SystemSetup(extension = KakaoinsuranceConstants.EXTENSIONNAME)
public class KakaoinsuranceSystemSetup
{
	private final KakaoinsuranceService kakaoinsuranceService;

	public KakaoinsuranceSystemSetup(final KakaoinsuranceService kakaoinsuranceService)
	{
		this.kakaoinsuranceService = kakaoinsuranceService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		kakaoinsuranceService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return KakaoinsuranceSystemSetup.class.getResourceAsStream("/kakaoinsurance/sap-hybris-platform.png");
	}
}
