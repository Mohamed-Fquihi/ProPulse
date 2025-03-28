package com.ProPulse.Backend.Service;

import com.ProPulse.Backend.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public List<String> getAllNoms() {
        return etudiantRepository.findAllNoms();
    }

    public List<String> getAllPrenoms() {
        return etudiantRepository.findAllPrenoms();
    }
}

