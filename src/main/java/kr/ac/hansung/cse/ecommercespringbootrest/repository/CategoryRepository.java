package kr.ac.hansung.cse.ecommercespringbootrest.repository;

import kr.ac.hansung.cse.ecommercespringbootrest.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
