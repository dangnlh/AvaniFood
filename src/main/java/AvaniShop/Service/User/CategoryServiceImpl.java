package AvaniShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dao.ProductDao;
import AvaniShop.Dto.ProductsDto;


@Service 
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	private ProductDao productDao ;
	
	
	public List<ProductsDto> GetAllProductsByID(int id) {
		
		return productDao.GetAllProductsByID(id) ;
	}


	public List<ProductsDto> GetDataProductsPaginate(int start, int end) {

		return productDao.GetDataProductsPaginate(start, end) ;
	}
	

//	public List<ProductsDto> GetDataProductsPaginate(int start , int end) {
//		
//		return productDao.GetDataProductsPaginate(start, end) ;
//	
//	}
}
