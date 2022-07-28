/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaron.springboot.usuariopractica.controller;

import aaron.springboot.usuariopractica.entity.Usuario;
import aaron.springboot.usuariopractica.service.UsuarioService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author arons
 */
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    
     @GetMapping("/listaUsuario")
    public ResponseEntity<List<Usuario>> listar(){
        List<Usuario> lista = usuarioService.findByAll();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
    
    @PostMapping("/crearUsuario")
    public ResponseEntity<Usuario> crear (@RequestBody Usuario p){
        return new ResponseEntity<>(usuarioService.crear(p), HttpStatus.CREATED);
    }
    
    @GetMapping("/buscarUsuario/{id}")
    public ResponseEntity<Usuario> buscar (@PathVariable Integer id){
        Usuario usuario = usuarioService.findById(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @PutMapping("/actualizarUsuario/{id}")
    public ResponseEntity<Usuario> actualizar(@PathVariable Integer id, @RequestBody Usuario per){
        Usuario usuarios = usuarioService.findById(id);
        if(usuarios == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            try {
                usuarios.setNombreUsuario(per.getNombreUsuario());
                usuarios.setClaveUsuario(per.getClaveUsuario());
                usuarios.setEmailUsuario(per.getEmailUsuario());
                usuarios.setClaveUsuario(per.getClaveUsuario());
                return new ResponseEntity<>(usuarioService.crear(usuarios), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }
    
    
    
    @DeleteMapping("/eliminarUsuario/{id}")
    public ResponseEntity<Usuario> eliminar(@PathVariable Integer id){
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
