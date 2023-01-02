package guru.springframework.controller;

import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting Index Page");
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }


}
