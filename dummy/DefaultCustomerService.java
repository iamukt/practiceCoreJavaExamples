/*
 [y] hybris Platform

  Copyright (c) 2000-2016 SAP SE All rights reserved.

  This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall
  not disclose such Confidential Information and shall use it only in accordance with the terms of the license
  agreement you entered into with SAP Hybris.*/

package de.hybris.platfrom.cuppytrailfrontend.serviceImpl;

import de.hybris.platform.cuppytrail.data.CustomerData;
import de.hybris.platform.cuppytrailfrontend.dao.CustomerDAO;
import de.hybris.platform.cuppytrailfrontend.model.CustomersModel;
import de.hybris.platfrom.cuppytrailfrontend.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DefaultCustomerService implements CustomerService
{

	@Autowired
	private CustomerDAO customerdao;

	/**
	 * @return the customerdao
	 */
	public CustomerDAO getCustomerdao()
	{
		return customerdao;
	}

	/**
	 * @param customerdao
	 *           the customerdao to set
	 */
	public void setCustomerdao(final CustomerDAO customerdao)
	{
		this.customerdao = customerdao;
	}





	@Override

	public void insert(final String name, final int id)
	{
		final CustomersModel model = new CustomersModel();
		System.out.println("Inside Default Customer Service");
		model.setCustomerID(Integer.valueOf(id));
		model.setCustomerName(name);
		customerdao.insertData(model);
	}

	public DefaultCustomerService()
	{
		System.out.println("DefaultCustomerService called ********************");
	}

	@Override
	public List<CustomerData> getData()
	{
		// YTODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomersModel> showData()
	{
		return customerdao.showData();

	}




}
