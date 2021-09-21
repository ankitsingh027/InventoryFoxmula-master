package com.foxmula.inventory.Repository;

import com.foxmula.inventory.Model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryManagerRepository extends CrudRepository<Course,Long> {
}
