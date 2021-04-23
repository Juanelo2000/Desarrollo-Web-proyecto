package com.aplicacion.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.aplicacion.mongo.model.Cubiculo;

public interface CubiculoRepository extends MongoRepository<Cubiculo, Integer>{

}
