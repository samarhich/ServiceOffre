package com.example.service_offreEmploi.dao;

import com.example.service_offreEmploi.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}
