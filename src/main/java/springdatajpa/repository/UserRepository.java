package springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springdatajpa.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
