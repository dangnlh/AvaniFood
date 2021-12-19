package AvaniShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import AvaniShop.Service.User.ProductServiceImpl;

@Controller
public class ProductController extends BaseController {
	@Autowired
	private ProductServiceImpl productServiceImpl;

		@RequestMapping(value = {"chi-tiet-san-pham" ,"san-pham/chi-tiet-san-pham/{id}"})
		public ModelAndView Index(@PathVariable String id) {
			_mvShare.setViewName("user/products/product");
			_mvShare.addObject("getProductByID" , productServiceImpl.GetProductById(Integer.parseInt(id) ));
			return _mvShare;
		}
		
}
