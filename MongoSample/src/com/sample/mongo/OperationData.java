package com.sample.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class OperationData {

	public static void main(String[] args) {
		MongoClient mongoClntObj = new MongoClient("localhost", 27017);
		MongoDatabase database = mongoClntObj.getDatabase("mydb");
		MongoCollection<Document> collection = database.getCollection("customerdata");
		
		Document basicDBObject = new Document();
		basicDBObject.append("name", "Ranbir");
		basicDBObject.append("age", 30);
		
		collection.insertOne(basicDBObject);
	}

}
