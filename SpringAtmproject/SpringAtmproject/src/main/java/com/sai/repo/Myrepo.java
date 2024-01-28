package com.sai.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sai.model.bankapplication;
@Repository
public interface Myrepo extends CrudRepository<bankapplication, Long> {

	bankapplication findByAccountnoAndNameAndPassword(long accountno, String name, String password);

}
