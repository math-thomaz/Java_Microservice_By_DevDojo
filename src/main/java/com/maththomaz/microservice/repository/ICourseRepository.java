package com.maththomaz.microservice.repository;

import com.maththomaz.microservice.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICourseRepository extends PagingAndSortingRepository<Course, Long> {

}
