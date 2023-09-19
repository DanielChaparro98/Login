package com.auxi.Login.service

import com.auxi.Login.model.Role
import kotlin.jvm.Throws

interface RoleService {
    fun saveRole(role:Role):Role
    fun updateRole(role:Role,throws: Exception):Role
    fun deleteRole(id:Long):String
    fun findAll():List<Role>
    fun findById(id:Long):Role
}