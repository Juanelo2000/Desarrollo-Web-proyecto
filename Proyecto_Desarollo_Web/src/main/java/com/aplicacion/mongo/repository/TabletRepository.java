package com.aplicacion.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.aplicacion.mongo.model.Tablet;

public interface TabletRepository extends MongoRepository<Tablet, Integer>{

}
