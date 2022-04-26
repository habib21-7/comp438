package com.comp438.assignments.Services;

import com.comp438.assignments.Repositories.CategoryRepository;
import com.comp438.assignments.utils.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAllCategories();
    }
    public Category  getCategoryById(long id){
        return categoryRepository.findById(id);
    }
}
