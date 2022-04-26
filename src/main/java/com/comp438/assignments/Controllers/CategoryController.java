package com.comp438.assignments.Controllers;

import com.comp438.assignments.Services.CategoryServices;
import com.comp438.assignments.utils.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryServices categoryService;

    @GetMapping("/category")
    public List<Category> getCategories()  {
        return categoryService.getAllCategories();
    }

    @GetMapping("/category/{id}")
    public Category getCategoryById(@PathVariable long id)  {
        return categoryService.getCategoryById(id);
    }
}
