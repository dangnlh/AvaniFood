package AvaniShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dto.ProductsDto;
import AvaniShop.Entity.Categorys;
import AvaniShop.Entity.Menus;
import AvaniShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlides(); 
	
	@Autowired
	public List<Categorys>GetDataCategorys(); 
	
	@Autowired
	public List<Menus>GetDataMenus(); 
	
	@Autowired
	public List<ProductsDto>GetDataNewProducts(); 
	
	@Autowired
	public List<ProductsDto>GetDataHighlightProducts(); 
}
