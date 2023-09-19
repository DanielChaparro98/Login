package com.auxi.Login.repository

import com.auxi.Login.model.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository:JpaRepository<Role,Long> {
}