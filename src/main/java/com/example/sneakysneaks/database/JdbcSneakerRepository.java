package com.example.sneakysneaks.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.sneakysneaks.objects.Sneaker;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@Repository
public class JdbcSneakerRepository implements SneakerRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String SQL_BRAND_SEARCH = "select * from sneakers" + 
			"where BRAND = ?";
	
	
	
	

	@Override
	public Iterable<Sneaker> findBrand(String brand) {
		return jdbcTemplate.query(SQL_BRAND_SEARCH, this::mapRowToResponse, brand);
	}

	@Override
	public Sneaker findSneaker(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sneaker checkHealth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addSneaker() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeSneaker() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private Sneaker mapRowToResponse(ResultSet rs, int rowNum) throws SQLException{	
		return	new Sneaker(							
						rs.getInt("product_number"), 
						rs.getString("brand"), 
						rs.getString("name"),
						rs.getInt("size"),
						rs.getDouble("price"));
		}
	
}
