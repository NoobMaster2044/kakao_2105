/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.kakaoinsurance.service;

public interface KakaoinsuranceService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
