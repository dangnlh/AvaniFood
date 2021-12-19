package AvaniShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import AvaniShop.Dto.ProductsDto;

@Service
public interface IProductService {
	public  List<ProductsDto> GetProductById (long id) ;
}
