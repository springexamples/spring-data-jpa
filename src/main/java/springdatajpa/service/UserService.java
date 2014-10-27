package springdatajpa.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import springdatajpa.domain.User;
import springdatajpa.repository.UserRepository;

@Service
public class UserService {

	@Inject
	private UserRepository userRepository;

	public void addUser(String firstName, String lastName, int age) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);

		userRepository.save(user);
	}

	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
	}
}
