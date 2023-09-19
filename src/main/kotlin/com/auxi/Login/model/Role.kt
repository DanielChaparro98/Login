package com.auxi.Login.model

import jakarta.persistence.*

@Entity
@Table(name="roles")
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    val name:String
)
