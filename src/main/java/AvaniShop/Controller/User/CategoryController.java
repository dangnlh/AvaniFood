package AvaniShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import AvaniShop.Dto.PaginatesDto;
import AvaniShop.Service.User.CategoryServiceImpl;
import AvaniShop.Service.User.PaginateServiceImpl;

@Controller
public class CategoryController extends BaseController {

	
	@Autowired
	private CategoryServiceImpl categorySerive ; 
	
	@Autowired PaginateServiceImpl paginateSerice ;
	
	private int totalProductPage = 9 ;
	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Product(@PathVariable String id) {
		_mvShare.setViewName("user/products/category");
//		_mvShare.addObject("idCategory", categorySerive.GetAllProductsByID(Integer.parseInt(id)));		
		_mvShare.addObject("idCategory",id);		
		int totalData = categorySerive.GetAllProductsByID( Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateSerice.GetInfoPaginate(totalData,totalProductPage, 1) ;
		_mvShare.addObject("paginateInfo" , paginateInfo);
		_mvShare.addObject("productsPaginate" , categorySerive.GetDataProductsPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));		
		return _mvShare;
		
	}
	
	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
	public ModelAndView Product(@PathVariable String id ,@PathVariable String currentPage) {
		_mvShare.setViewName("user/products/category");
//		_mvShare.addObject("idCategory", categorySerive.GetAllProductsByID(Integer.parseInt(id)));		
		_mvShare.addObject("idCategory",id);		
		int totalData = categorySerive.GetAllProductsByID( Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginateSerice.GetInfoPaginate(totalData, totalProductPage, Integer.parseInt(currentPage)) ;
		_mvShare.addObject("paginateInfo" , paginateInfo);
		_mvShare.addObject("productsPaginate" , categorySerive.GetDataProductsPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));		
		return _mvShare;
		
	}
}
