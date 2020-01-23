package com.sa.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sa.core.entity.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long>{

}
