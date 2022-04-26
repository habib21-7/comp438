package com.comp438.assignments.Repositories;

import com.comp438.assignments.utils.models.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository  extends CrudRepository<Category,Long> {
    Category findById(long id);

    @Query(value = "SELECT c.* FROM category as c", nativeQuery = true)
    List<Category> findAllCategories();

}
