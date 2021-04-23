package com.aplicacion.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.aplicacion.mongo.model.Computador;


public interface ComputadorRepository extends MongoRepository<Computador, Integer>{

}
