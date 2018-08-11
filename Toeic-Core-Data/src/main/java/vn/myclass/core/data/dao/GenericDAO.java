package vn.myclass.core.data.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO <ID extends Serializable,T>{
    List<T> findAll(ID id);
    T update(T object);
} 
