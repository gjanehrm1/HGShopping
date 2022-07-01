package com.shopping.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String moveIndex() {
        return "index.tiles";
    }
    
    @GetMapping("/index")
    public String moveHome() {
        return "index.tiles";
    }
    
    @GetMapping("/about")
    public String moveAbout() {
    	return "about.tiles";
    }
    
    @GetMapping("/shop")
    public String moveShop() {
    	return "shop.tiles";
    }
    
    @GetMapping("/blog")
    public String moveBlog() {
    	return "blog.tiles";
    }
    
    @GetMapping("/contact")
    public String moveContact() {
    	return "contact.tiles";
    }
    
}
