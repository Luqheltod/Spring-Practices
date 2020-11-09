package com.springPruebaQualifier.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.springPruebaQualifier.Application;

@Repository
@Qualifier("persona2")
public class IpersonaRepoImp2 implements IpersonaRepo{

	private static Logger LOG = LoggerFactory.getLogger(Application.class);
	
	
	@Override
	public void registrar(String nombre) {

      LOG.info("No se registro al gran Gsancho");
		
	}

}
