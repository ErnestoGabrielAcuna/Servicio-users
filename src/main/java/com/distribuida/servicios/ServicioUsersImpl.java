package com.distribuida.servicios;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Users;

@ApplicationScoped
@Transactional
public class ServicioUsersImpl implements ServicioUsers{
	@PersistenceContext(unitName = "UsersPU")
	private EntityManager entityManager;
	@Override
	public List<Users> getUsers() {
		List<Users> lista = null;
		lista = entityManager.createNamedQuery("Users.findAll", Users.class).getResultList();
		return lista;
		
	}
	

}
