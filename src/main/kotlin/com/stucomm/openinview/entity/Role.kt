package com.stucomm.openinview.entity

import javax.persistence.*

@Entity
@Table(name = "role")
class Role(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(nullable = false)
        var name: String
)