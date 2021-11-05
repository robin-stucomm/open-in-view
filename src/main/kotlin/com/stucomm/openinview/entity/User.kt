package com.stucomm.openinview.entity

import javax.persistence.*

@Entity
@Table(name = "user")
class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(nullable = false)
        var name: String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn
        var role: Role,

        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "user_hobby",
                joinColumns = [(JoinColumn(name = "user_id"))],
                inverseJoinColumns = [(JoinColumn(name = "hobby_id"))])
        var hobbies: List<Hobby> = listOf()
)