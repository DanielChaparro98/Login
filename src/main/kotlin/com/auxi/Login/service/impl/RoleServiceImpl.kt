package com.auxi.Login.service.impl

import com.auxi.Login.model.Role
import com.auxi.Login.repository.RoleRepository
import com.auxi.Login.service.RoleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RoleServiceImpl(@Autowired private val roleRepository:RoleRepository):RoleService {
    override fun saveRole(role: Role): Role {
        val option = roleRepository.findAll();
        for(roles in option){
            if(roles.id == role.id){
                throw Exception("El rol ya existe")
            }
        }
        return roleRepository.save(role)
    }

    override fun updateRole(role: Role, throws: Exception): Role {
        TODO("Not yet implemented")
    }

    override fun deleteRole(id: Long): String {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Role> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): Role {
        TODO("Not yet implemented")
    }

}