package AvaniShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import AvaniShop.Entity.MapperMenus;
import AvaniShop.Entity.Menus;

@Repository
public class menusDao extends BaseDao {
	public List<Menus> GetDataMenus(){
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM menus";
		list = _jdbcTemplate.query(sql, new MapperMenus()) ;
		return list ; 
	}
}
