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
package de.hybris.platform.cuppytrailfrontend.daos.impl;

import de.hybris.platform.cuppytrailfrontend.dao.CustomerDAO;
import de.hybris.platform.cuppytrailfrontend.model.CustomersModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;



@Repository
public class DefaultCustomerDAO implements CustomerDAO
{
	@Resource
	ModelService modelService;
	@Resource
	private FlexibleSearchService flexibleSearchService;


	@Override
	public void insertData(final CustomersModel custmodel)
	{
		System.out.println("Inside Default CustomerDAO");
		modelService.save(custmodel);
	}


	public DefaultCustomerDAO()
	{
		System.out.println("DefaultCustomerDAO Called ********************");
	}


	@Override
	public List<CustomersModel> showData()
	{
		System.out.println("SHOW DATA DAO*****************");
		final String queryString = "SELECT {p:" + CustomersModel.PK + "}" + "FROM {" + CustomersModel._TYPECODE + " AS p}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		System.out.println("before flexible");
		System.out.println(flexibleSearchService);

		return flexibleSearchService.<CustomersModel> search(query).getResult();
	}


	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}


	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}


	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}


	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		System.out.println("in f search service");
		this.flexibleSearchService = flexibleSearchService;
	}


}
