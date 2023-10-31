/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.kakaoprices.service;

public interface KakaopricesService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
