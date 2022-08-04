package RecipeBlog.controller;

import RecipeBlog.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/Recipes")
    public String getRecipes(){
        return "This will be a list of recipes";
    }
}
