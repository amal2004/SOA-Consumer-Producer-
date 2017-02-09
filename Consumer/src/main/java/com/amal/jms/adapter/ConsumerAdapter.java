package com.amal.jms.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

@Component
public class ConsumerAdapter {

	private static final Logger logger = LogManager
			.getLogger(ConsumerAdapter.class.getName());

	@SuppressWarnings({ "resource", "deprecation" })
	public void sendToMongo(String json) {

		logger.info("Sending to MongoDB");
		MongoClient client = new MongoClient();
		DB db = client.getDB("vendor");
		DBCollection collection = db.getCollection("contact");
		
		logger.info("Converting JSON object to DBObject");
		DBObject dbObject = (DBObject) JSON.parse(json);
		collection.insert(dbObject);
		logger.info("Sent to MongoDB");
	}

}
