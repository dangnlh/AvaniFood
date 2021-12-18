package AvaniShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dao.ProductDao;
import AvaniShop.Dto.ProductsDto;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductDao productDao ;

	public List<ProductsDto> GetProductById(long id) {
			
		return productDao.GetProductById(id);
	}
	
	
	

}
