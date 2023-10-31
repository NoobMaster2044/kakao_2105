/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.kakaoprices.setup;

import static com.kakaoprices.constants.KakaopricesConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.kakaoprices.constants.KakaopricesConstants;
import com.kakaoprices.service.KakaopricesService;


@SystemSetup(extension = KakaopricesConstants.EXTENSIONNAME)
public class KakaopricesSystemSetup
{
	private final KakaopricesService kakaopricesService;

	public KakaopricesSystemSetup(final KakaopricesService kakaopricesService)
	{
		this.kakaopricesService = kakaopricesService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		kakaopricesService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return KakaopricesSystemSetup.class.getResourceAsStream("/kakaoprices/sap-hybris-platform.png");
	}
}
