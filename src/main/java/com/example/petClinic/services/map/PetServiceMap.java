package com.example.petClinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.petClinic.model.Pet;
import com.example.petClinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet obj) {
		return super.save( obj);
	}
	
	@Override
	public void delete(Pet obj) {
		super.delete(obj);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
