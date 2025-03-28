package com.ProPulse.Backend.Repository;

import com.ProPulse.Backend.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {

    // Récupérer tous les noms
    @Query("SELECT e.nom FROM Etudiant e")
    List<String> findAllNoms();

    // Récupérer tous les prénoms
    @Query("SELECT e.prenom FROM Etudiant e")
    List<String> findAllPrenoms();

}