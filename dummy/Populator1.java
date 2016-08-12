/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.cuppytrailfrontend.converters;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.cuppytrail.data.CustomerData;
import de.hybris.platform.cuppytrailfrontend.model.CustomersModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;


/**
 *
 */
public class Populator1 implements Populator<CustomersModel, CustomerData>
{

	static Logger log = Logger.getLogger(Populator1.class.getName());

	@Override
	public void populate(final CustomersModel source, final CustomerData target) throws ConversionException
	{
		log.info("in populator");
		target.setName(source.getCustomerName());
	}




}
