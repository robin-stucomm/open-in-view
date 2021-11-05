package com.stucomm.openinview.entity

import javax.persistence.*

@Entity
@Table(name = "hobby")
class Hobby(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var name: String,

    @ManyToMany(mappedBy = "hobbies", fetch = FetchType.LAZY)
    var users: List<User> = emptyList(),
)