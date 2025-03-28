package com.ProPulse.Backend.Controller;

import com.ProPulse.Backend.Service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@CrossOrigin("*")  // Pour autoriser les requêtes depuis le frontend
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    // Récupérer uniquement les noms
    @GetMapping("/noms")
    public List<String> getNoms() {
        return etudiantService.getAllNoms();
    }

    // Récupérer uniquement les prénoms
    @GetMapping("/prenoms")
    public List<String> getPrenoms() {
        return etudiantService.getAllPrenoms();
    }

}

