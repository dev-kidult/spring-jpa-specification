package devkidult.git.jpaspecification.controller

import com.turkraft.springfilter.boot.Filter
import devkidult.git.jpaspecification.entity.User
import devkidult.git.jpaspecification.service.UserService
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @GetMapping("/api/v1/users")
    fun list(@Filter filter: Specification<User>, pageable: Pageable) = userService.list(filter, pageable)
}
