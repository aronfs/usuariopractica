/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aaron.springboot.usuariopractica.service;

import aaron.springboot.usuariopractica.entity.Usuario;
import java.util.List;

/**
 *
 * @author arons
 */
public interface UsuarioService {

    public Usuario crear(Usuario p);

    public Usuario findById(Integer id);

    public List<Usuario> findByAll();

    public void delete(Integer id);
}
