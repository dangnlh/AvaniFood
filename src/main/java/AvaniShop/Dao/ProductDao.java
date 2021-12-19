package AvaniShop.Dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import AvaniShop.Dto.MapperProductsDto;
import AvaniShop.Dto.ProductsDto;


@Repository
public class ProductDao extends BaseDao{
	
	private StringBuffer SqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("select ");
		sql.append("p.id as id_product ");
		sql.append(", p.id_category ");
		sql.append(", p.sizes ");
		sql.append(", p.name ");
		sql.append(", p.price ");
		sql.append(", p.sale ");
		sql.append(", p.title ");
		sql.append(", p.highlight ");
		sql.append(", p.new_product ");
		sql.append(", p.details ");
		sql.append(", c.id as id_color ");
		sql.append(", c.name as name_color ");
		sql.append(", c.code as code_color ");
		sql.append(", c.img ");
		sql.append(", p.created_at ");
		sql.append(", p.updated_at ");
		sql.append("FROM ");
		sql.append("products as p ");
		sql.append("INNER JOIN ");
		sql.append("colors as c ");
		sql.append("On p.id = c.id_product ");
		
		return sql;
	}
	private String SqlProducts (boolean new_product , boolean highlight) {
		StringBuffer sql = SqlString();
		if(highlight) {
			sql.append("where p.highlight = true ");
		}
		if(new_product) {
			sql.append("And p.new_product = true ");
		}
		
		sql.append("GROUP BY p.id , c.id_product ");
		sql.append("Order by rand() ");
		if(highlight) {
			sql.append("Limit 9 ");
		}
		if(new_product) {
			sql.append("Limit 12 ");
		}
		
		return sql.toString();
	}
	
	private String SqlProductsPaginate (int start , int end) {
		StringBuffer sql = SqlString();		


		sql.append("LIMIT " + start + ", "+ end);
		return sql.toString();
	}
	
	private String SqlProductsByID (int id) {
		StringBuffer sql = SqlString();
		sql.append("where 1 = 1 ");
		sql.append("and id_category =  "+id);
		return sql.toString();
	}
	
	public List<ProductsDto> GetAllProductsByID(int id) {
			
		String sql = SqlProductsByID(id) ;
		List<ProductsDto> list  = _jdbcTemplate.query(sql, new MapperProductsDto()) ;
		return list ; 
	}
	
	
	
	public List<ProductsDto> GetDataNewProducts(){
		String sql = SqlProducts(true, false);
		List<ProductsDto> list  = _jdbcTemplate.query(sql, new MapperProductsDto()) ;
		return list ; 
	}
	
	public List<ProductsDto>GetDataHighlightProducts(){
		String sql = SqlProducts(false, true);
		List<ProductsDto> list  = _jdbcTemplate.query(sql, new MapperProductsDto()) ;
		return list ; 
	}
	public List<ProductsDto> GetDataProductsPaginate(int start, int end) {

		String sql = SqlProductsPaginate(start, end);
		List<ProductsDto> list  = _jdbcTemplate.query(sql, new MapperProductsDto()) ;
		return list;
	}
	
	private String SqlProductById (long id) {
		StringBuffer sql = SqlString();		

		sql.append("WHERE p.id = " + id );
		sql.append(" LIMIT 1 ");
		return sql.toString();
	}
	public List<ProductsDto> GetProductById(long id) {
		String sql = SqlProductById(id);
		List<ProductsDto> list  = _jdbcTemplate.query(sql, new MapperProductsDto()) ;
		return list;
	}
	
	
}
