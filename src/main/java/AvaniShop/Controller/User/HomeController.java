package AvaniShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import AvaniShop.Dao.SlidesDao;
import AvaniShop.Service.User.HomeServiceImpl;

@Controller
public class HomeController extends BaseController {
	
	
	@RequestMapping(value= {"/", "/trang-chu"})
	public ModelAndView Index() {
//		ModelAndView mv = new ModelAndView(); 
		_mvShare.setViewName("user/index");
		_mvShare.addObject("slides", _homeService.GetDataSlides());
		_mvShare.addObject("categorys", _homeService.GetDataCategorys()); 
		return _mvShare ;
	}
}