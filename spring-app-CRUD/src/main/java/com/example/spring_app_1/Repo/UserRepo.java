/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.spring_app_1.Repo;
;
import com.example.spring_app_1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ranit
 */
public interface UserRepo extends JpaRepository<User,Long> {
    
}
