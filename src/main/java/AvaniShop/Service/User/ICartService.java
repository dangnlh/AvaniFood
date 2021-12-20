package AvaniShop.Service.User;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dto.CartDto;
import AvaniShop.Dto.ProductsDto;

@Service
public interface ICartService {
		
	@Autowired
	public  HashMap< Long , CartDto> AddCart (long id , HashMap< Long , CartDto> cart) ;
	@Autowired
	public  HashMap< Long , CartDto> EditCart (long id , int quanty ,HashMap< Long , CartDto> cart) ;
	@Autowired
	public  HashMap< Long , CartDto> DeleteCart (long id , HashMap< Long , CartDto> cart) ;
	@Autowired
	public  int TotalQuantity ( HashMap< Long , CartDto> cart) ;
	@Autowired
	public  double TotalPrice ( HashMap< Long , CartDto> cart) ;
}
