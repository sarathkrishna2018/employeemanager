package com.employeemanager.employeemanager.repo;

import com.employeemanager.employeemanager.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class RequestRepoCustomImpl implements RequestRepoCustom{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Request> getEmployeeRequests(String id){
        Query query = entityManager.createNativeQuery("SELECT * from request WHERE emp_id = :emp ", Request.class);
        System.out.println("DEBUG: [ID]" + id);
        query.setParameter("emp",id);

        List<Request> requests = query.getResultList();
        return requests;

    }

}
