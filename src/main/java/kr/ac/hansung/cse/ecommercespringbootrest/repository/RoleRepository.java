package kr.ac.hansung.cse.ecommercespringbootrest.repository;

import kr.ac.hansung.cse.ecommercespringbootrest.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRolename(String rolename);
}