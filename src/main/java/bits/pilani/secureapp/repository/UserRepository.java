package bits.pilani.secureapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bits.pilani.secureapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	User findByUsername(String username);
}
