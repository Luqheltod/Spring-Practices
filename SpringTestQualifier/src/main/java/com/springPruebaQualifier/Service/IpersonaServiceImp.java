package com.springPruebaQualifier.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springPruebaQualifier.Repository.IpersonaRepo;

@Service
public class IpersonaServiceImp implements IpersonaService {
    @Autowired
    @Qualifier("persona2")
	private IpersonaRepo repo;

	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);
		
	}
}
