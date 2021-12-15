package AvaniShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import AvaniShop.Entity.Categorys;
import AvaniShop.Entity.MapperCategorys;





@Repository
public class categorysDao extends BaseDao {
	
	
	public List<Categorys> GetDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "select * from categorys" ;
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}
}
