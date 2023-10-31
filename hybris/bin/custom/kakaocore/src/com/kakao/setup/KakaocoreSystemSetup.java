/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.kakao.setup;

import static com.kakao.constants.KakaocoreConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.kakao.constants.KakaocoreConstants;
import com.kakao.service.KakaocoreService;


@SystemSetup(extension = KakaocoreConstants.EXTENSIONNAME)
public class KakaocoreSystemSetup
{
	private final KakaocoreService kakaocoreService;

	public KakaocoreSystemSetup(final KakaocoreService kakaocoreService)
	{
		this.kakaocoreService = kakaocoreService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		kakaocoreService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return KakaocoreSystemSetup.class.getResourceAsStream("/kakaocore/sap-hybris-platform.png");
	}
}
