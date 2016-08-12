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
package de.hybris.platform.cuppytrailfrontend.controller;

import de.hybris.platform.cuppytrail.data.CustomerData;
import de.hybris.platform.cuppytrailfrontend.daos.impl.DefaultCustomerDAO;
import de.hybris.platform.cuppytrailfrontend.facade.CustomerFacade;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class CustomerController
{
	//private static final Logger LOGGER = Logger.getLogger(DefaultPickupCheckoutStepValidator.class);

	@Resource
	private CustomerFacade customerfacade;



	@Resource
	private DefaultCustomerDAO defaultCustomerDAO;




	/**
	 * @return the customerfacade
	 */
	public CustomerFacade getCustomerfacade()
	{
		return customerfacade;
	}

	/**
	 * @param customerfacade
	 *           the customerfacade to set
	 */
	public void setCustomerfacade(final CustomerFacade customerfacade)
	{
		this.customerfacade = customerfacade;
	}

	/**
	 * @return the dao
	 */
	/*
	 * public DefaultCustomerDAO getDao() { return dao; }
	 */

	/**
	 * @param dao
	 *           the dao to set
	 */
	/*
	 * public void setDao(final DefaultCustomerDAO dao) { this.dao = dao; }
	 */

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public ModelAndView insertData(@RequestParam(value = "Name") final String name, @RequestParam(value = "Id") final int id)
	{

		System.out.println("Customers Controller");
		System.out.println("Name  = " + name);
		System.out.println("Id = " + id);

		/* Call to CustomerFacade */
		customerfacade.insert(name, id);
		//customerfacade.convertDTO();



		final List<CustomerData> list = customerfacade.getData();
		//final List<CustomersModel> list = defaultCustomerDAO.showData();
		//final List<CustomerData> custData = new ArrayList<CustomerData>();
		/*
		 * for (final CustomersModel customersModel : list) { final CustomerData cd = new CustomerData();
		 * cd.setID(customersModel.getCustomerID()); cd.setName(customersModel.getCustomerName()); custData.add(cd); }
		 */
		final ModelAndView mav = new ModelAndView("StadiumListing");
		return mav.addObject("lists", list);


	}
}



