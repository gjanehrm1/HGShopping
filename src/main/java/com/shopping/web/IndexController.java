package com.shopping.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("")
    public ModelAndView moveIndex() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("/index");
        return mv;
    }
    
    @GetMapping("/index")
    public ModelAndView moveHome() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("common/layout");
        return mv;
    }
    
    @GetMapping("/about")
    public ModelAndView moveAbout() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("/about");
        return mv;
    }
    
    @GetMapping("/shop")
    public ModelAndView moveShop() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("/shop");
        return mv;
    }
    
    @GetMapping("/blog")
    public ModelAndView moveBlog() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("/blog");
        return mv;
    }
    
    @GetMapping("/contact")
    public ModelAndView moveContact() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("/contact");
        return mv;
    }
    
}
