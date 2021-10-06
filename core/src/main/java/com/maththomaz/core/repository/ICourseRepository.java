package com.maththomaz.core.repository;


import com.maththomaz.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICourseRepository extends PagingAndSortingRepository<Course, Long> {

}
