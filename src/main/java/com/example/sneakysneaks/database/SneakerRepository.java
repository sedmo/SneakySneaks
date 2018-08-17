package com.example.sneakysneaks.database;

import org.springframework.stereotype.Repository;

import com.example.sneakysneaks.objects.Sneaker;

@Repository
public interface SneakerRepository {
	Iterable<Sneaker> findBrand(String brand);
	Sneaker findSneaker(int id);
	Sneaker checkHealth();
	boolean addSneaker();
	boolean removeSneaker();
}
