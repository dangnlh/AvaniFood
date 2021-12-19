package AvaniShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dto.ProductsDto;

@Service
public interface ICategoryService {
	
	@Autowired
	public List<ProductsDto> GetAllProductsByID (int id);
	@Autowired
	public List<ProductsDto> GetDataProductsPaginate(int start , int end);
}
