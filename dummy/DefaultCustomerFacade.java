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
package de.hybris.platform.cuppytrailfrontend.facades.impl;


import de.hybris.platform.cuppytrail.data.CustomerData;
import de.hybris.platform.cuppytrailfrontend.facade.CustomerFacade;
import de.hybris.platform.cuppytrailfrontend.model.CustomersModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platfrom.cuppytrailfrontend.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;





public class DefaultCustomerFacade implements CustomerFacade
{


	@Autowired
	private CustomerService customerService;

	@Autowired
	private Converter<CustomersModel, CustomerData> customerConverter;

	public Converter<CustomersModel, CustomerData> getCustomerConverter()
	{
		return customerConverter;
	}


	public void setCustomerConverter(final Converter<CustomersModel, CustomerData> customerConverter)
	{
		this.customerConverter = customerConverter;
	}

	public CustomerService getCustomerService()
	{
		return customerService;
	}

	public void setCustomerService(final CustomerService customerService)
	{
		this.customerService = customerService;
	}

	@Override
	public void insert(final String name, final int id)
	{
		/*
		 * final CustomersModel model = customerService.insert(name, id); final CustomerData data =
		 * customerConverter.convert(model);
		 */
		System.out.println("Inside Default customer facade");
		customerService.insert(name, id);
	}


	public DefaultCustomerFacade()
	{
		System.out.println("DefaultCustomerFacade Constructor Called ***************");
	}


	@Override
	public List<CustomerData> getData()
	{
		//final List<CustomerData> data;
		final List<CustomersModel> model = customerService.showData();

		//customer.convertAll(model);
		return customerConverter.convertAll(model);
		//return data;
	}


}
