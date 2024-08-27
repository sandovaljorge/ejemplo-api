package com.jscode.example.controllers;

import com.jscode.example.entities.UsuarioEntity;
import com.jscode.example.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/")
    public ResponseEntity<List<UsuarioEntity>> getAll(){
        return new ResponseEntity<>(this.usuarioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UsuarioEntity>> getOne(@PathVariable("id") Long id){
        return new ResponseEntity<>(this.usuarioService.getOne(id), HttpStatus.OK);
    }
}
