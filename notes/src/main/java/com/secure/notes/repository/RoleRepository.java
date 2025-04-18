package com.secure.notes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.notes.model.AppRole;
import com.secure.notes.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
