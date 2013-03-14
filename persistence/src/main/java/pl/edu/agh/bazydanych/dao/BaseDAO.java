package pl.edu.agh.bazydanych.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class BaseDAO<T> implements IDAO<T> {


	protected EntityManager em;
	protected HibernateTemplate hibernateTemplate;

	private Class<T> entityClass;

	public BaseDAO() {
		this.entityClass = ((Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0]);
	}
	
	@Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	


	public T create(final T t) {
		hibernateTemplate.persist(t);
		return t;
	}

	public void edit(T entity) {
		hibernateTemplate.merge(entity);
	}

	public void delete(Object entity) {
		this.hibernateTemplate.delete(entity);
	}

	public T find(final Serializable id) {
		return (T) this.hibernateTemplate.get(entityClass, id);
	}

	public T update(final T t) {
		return this.hibernateTemplate.merge(t);
	}

	public List<T> findAll() {
		return hibernateTemplate.findByCriteria(DetachedCriteria.forClass(entityClass));
	}


}
