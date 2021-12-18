package AvaniShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dao.ProductDao;
import AvaniShop.Dao.SlidesDao;
import AvaniShop.Dao.categorysDao;
import AvaniShop.Dao.menusDao;
import AvaniShop.Dto.ProductsDto;
import AvaniShop.Entity.Categorys;
import AvaniShop.Entity.Menus;
import AvaniShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao ;
	
	@Autowired 
	private categorysDao categorysDao;
	
	@Autowired
	private menusDao menusDao;
	
	@Autowired
	private ProductDao productsDao ; 
	
	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}
	public List<Categorys> GetDataCategorys() {
		return categorysDao.GetDataCategorys();
	}
	public List<Menus> GetDataMenus() {

		return menusDao.GetDataMenus();
	}
	public List<ProductsDto> GetDataNewProducts() {
	
		return productsDao.GetDataNewProducts();
	}
	public List<ProductsDto> GetDataHighlightProducts() {
		
		return productsDao.GetDataHighlightProducts();
	}
	
	

}
