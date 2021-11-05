package com.stucomm.openinview.repository

import com.stucomm.openinview.entity.User
import org.springframework.data.jpa.repository.EntityGraph
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = [
                "role",
                "hobbies"
            ]
    )
    override fun findAll(): List<User>
}