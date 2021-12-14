package AvaniShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import AvaniShop.Entity.MapperSlides;
import AvaniShop.Entity.Slides;

@Repository
public class SlidesDao {
	
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Slides> GetDataSlides() {
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
}
