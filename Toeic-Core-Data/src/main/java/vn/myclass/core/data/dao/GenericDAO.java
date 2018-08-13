package vn.myclass.core.data.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO <ID extends Serializable,T>{
    List<T> findAll();
    T update(T object);
    boolean delete(T object);
    void save(T object);
    T findById(ID id);
    Object[] findByProperty(String property,Object value,String sortExpression,String sortDirection);
} 
