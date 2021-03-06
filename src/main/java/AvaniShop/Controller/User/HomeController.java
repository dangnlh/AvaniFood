package AvaniShop.Controller.User;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController extends BaseController {
	
	
	@RequestMapping(value= {"/", "/trang-chu"})
	public ModelAndView Index() {
//		ModelAndView mv = new ModelAndView(); 
		_mvShare.setViewName("user/index");
		_mvShare.addObject("slides", _homeService.GetDataSlides());
		_mvShare.addObject("categorys", _homeService.GetDataCategorys()); 
		_mvShare.addObject("products", _homeService.GetDataNewProducts()); 
		_mvShare.addObject("highlightproducts", _homeService.GetDataHighlightProducts()); 
		return _mvShare ;
	}
	
	
}