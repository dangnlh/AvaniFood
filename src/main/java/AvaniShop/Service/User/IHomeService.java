package AvaniShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Entity.Categorys;
import AvaniShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlides(); 
	
	@Autowired
	public List<Categorys>GetDataCategorys(); 
}
