/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aaron.springboot.usuariopractica.service;

import aaron.springboot.usuariopractica.dao.usuarioRepositorio;
import aaron.springboot.usuariopractica.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author arons
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{
    
    @Autowired
    private usuarioRepositorio repositorio;

    @Override
    public Usuario crear(Usuario p) {
        return repositorio.save(p);
    }

    @Override
    public Usuario findById(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    @Override
    public List<Usuario> findByAll() {
        return repositorio.findAll();
    }

    @Override
    public void delete(Integer id) {
        repositorio.deleteById(id);
    }
    
}
