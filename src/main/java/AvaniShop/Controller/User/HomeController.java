package AvaniShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import AvaniShop.Dao.SlidesDao;
import AvaniShop.Service.User.HomeServiceImpl;

@Controller
public class HomeController {
	@Autowired
	HomeServiceImpl homeService ;  
	
	@RequestMapping(value= {"/", "/trang-chu"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("user/index");
		mv.addObject("slides", homeService.GetDataSlides()); 
		return mv ;
	}
}