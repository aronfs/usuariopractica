/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aaron.springboot.usuariopractica.dao;

import aaron.springboot.usuariopractica.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author arons
 */
public interface usuarioRepositorio extends JpaRepository<Usuario, Integer>{
    
}
