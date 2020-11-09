package com.springPruebaBeans.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springPruebaBeans.repository.IpersonaRepo;

@Service
public class IpersonasServiceImp implements IpersonaService {
    @Autowired
    
	private IpersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		
		repo.registrar(nombre);
		
	}

}
