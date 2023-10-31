/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.kakao.service;

public interface KakaocoreService
{
	String getHybrisLogoUrl(String logoCode);

	void createLogo(String logoCode);
}
