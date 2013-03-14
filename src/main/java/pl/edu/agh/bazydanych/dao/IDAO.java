package pl.edu.agh.bazydanych.dao;

import java.io.Serializable;
import java.util.List;

public interface IDAO<T> {

	T create(T t);

    void delete(Object id);

    T find(final Serializable id);

    T update(T t);   
    
    void edit(T entity);
    
    List<T> findAll();
}
