package devkidult.git.jpaspecification.service

import devkidult.git.jpaspecification.entity.User
import devkidult.git.jpaspecification.repository.UserRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun list(filter: Specification<User>, pageable: Pageable): Page<User> = userRepository.findAll(filter, pageable)
}
