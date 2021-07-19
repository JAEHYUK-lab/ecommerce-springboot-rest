package kr.ac.hansung.cse.ecommercespringbootrest.repository;

import kr.ac.hansung.cse.ecommercespringbootrest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}