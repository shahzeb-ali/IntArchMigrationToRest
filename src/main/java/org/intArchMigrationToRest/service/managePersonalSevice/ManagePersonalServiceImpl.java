package org.intArchMigrationToRest.service.managePersonalSevice;

import java.util.List;

import org.intArchMigrationToRest.dtos.salesman.SalesMan;
import org.bson.Document;
import org.springframework.stereotype.Service;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
@Service
public class ManagePersonalServiceImpl implements org.intArchMigrationToRest.service.ManagePersonalService{

	
	private MongoClient client = new MongoClient("localhost", 27017);
	private MongoDatabase supermongo = client.getDatabase("highperformance");
	public MongoCollection<Document> salesmen = supermongo.getCollection("salesmen");
	@Override
	public boolean create(SalesMan t) {
		t.toDocument();
		// saving the salesman object
		System.out.println("Making Entry to Salesman Collection");
		salesmen.insertOne(t.toDocument());
		return false;
	}
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(Integer id, org.intArchMigrationToRest.dtos.salesman.SalesMan t) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<org.intArchMigrationToRest.dtos.salesman.SalesMan> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public org.intArchMigrationToRest.dtos.salesman.SalesMan get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	




}
