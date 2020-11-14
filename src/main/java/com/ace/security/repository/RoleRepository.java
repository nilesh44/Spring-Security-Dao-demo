package com.ace.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ace.security.entity.Roles;
@Repository
public interface RoleRepository extends CrudRepository<Roles, String>{

}
