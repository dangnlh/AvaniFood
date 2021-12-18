package AvaniShop.Service.User;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dto.PaginatesDto;


@Service
public interface IPaginateService {

	@Autowired
	public PaginatesDto GetInfoPaginate(int totalData , int limit , int currentPage); 
}
