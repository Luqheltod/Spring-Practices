package com.springPruebaBeans.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springPruebaBeans.Application;
@Repository
public class IpersonasRepoImp implements IpersonaRepo {

	private static Logger LOG = LoggerFactory.getLogger(Application.class);
	@Override
	public void registrar(String nombre) {
		
		LOG.info("Registrado " + nombre);
		
	}

}
