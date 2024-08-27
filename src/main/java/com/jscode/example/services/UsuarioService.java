package com.jscode.example.services;

import com.jscode.example.entities.UsuarioEntity;
import com.jscode.example.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<UsuarioEntity> getAll(){
        return this.usuarioRepository.findAll();
    }

    public Optional<UsuarioEntity> getOne(Long id){
        return this.usuarioRepository.findById(id);
    }


}
