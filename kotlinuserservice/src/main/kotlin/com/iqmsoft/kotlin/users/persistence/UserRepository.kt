package com.iqmsoft.kotlin.users.persistence

import org.springframework.data.repository.CrudRepository
import com.iqmsoft.kotlin.users.model.User

interface UserRepository : CrudRepository<User, String>