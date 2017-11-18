package com.pawdirect.spring.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.pawdirect.spring.dao.Offer;
import com.pawdirect.spring.dao.OffersDao;

@Service("offersService")
public class OffersService {
	
	private OffersDao offersDao;
	
	@Autowired
	public void setOffersDao(OffersDao offersDao) {
		this.offersDao = offersDao;
	}


	public List<Offer> getCurrent() {
		return offersDao.getOffers();
	}

	@Secured({"ROLE_USER","ROLE_ADMIN"})
	public void create(@Valid Offer offer) {
		offersDao.create(offer);
		
	}


	public void throwsTestException() {
		offersDao.getOffer(99999);
		
	}
}
