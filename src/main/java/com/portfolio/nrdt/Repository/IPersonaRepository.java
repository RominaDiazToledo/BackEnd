/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.nrdt.Repository;

import com.portfolio.nrdt.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author romin
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
