package AvaniShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AvaniShop.Dao.SlidesDao;
import AvaniShop.Dao.categorysDao;
import AvaniShop.Entity.Categorys;
import AvaniShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao ;
	
	@Autowired 
	private categorysDao categorysDao;
	
	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}
	public List<Categorys> GetDataCategorys() {
	
		return categorysDao.GetDataCategorys();
	}

	

}
