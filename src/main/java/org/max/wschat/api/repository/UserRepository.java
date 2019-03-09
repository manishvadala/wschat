package org.max.wschat.api.repository;

import org.max.wschat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    User findUserByUsername(String username);
}
