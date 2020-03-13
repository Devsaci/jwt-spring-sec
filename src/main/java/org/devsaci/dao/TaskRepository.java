package org.devsaci.dao;

import org.devsaci.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



//@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Long>{

}
