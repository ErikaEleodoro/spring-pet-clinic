package com.example.petClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petClinic.model.Vet;
import com.example.petClinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService{

	
	@Override 
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long Id) {
		return super.findById(Id);
	}
	
	@Override
	public Vet save(Vet obj) {
		return super.save(obj);
	}
	
	@Override
	public void delete(Vet obj) {
		super.delete(obj);
	}
	
	@Override 
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
