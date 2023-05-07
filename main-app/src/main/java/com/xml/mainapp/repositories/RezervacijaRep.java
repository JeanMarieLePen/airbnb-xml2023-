package com.xml.mainapp.repositories;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xml.mainapp.model.data.Rezervacija;
import com.xml.mainapp.model.data.StatusRezervacije;

public interface RezervacijaRep extends JpaRepository<Rezervacija, Long>{

	//vrati listu rezervacija koje se odnose na smestaj sa id-om id
	Optional<Collection<Rezervacija>> findBySmestajIdAndStatus(Long id, StatusRezervacije status);
}
