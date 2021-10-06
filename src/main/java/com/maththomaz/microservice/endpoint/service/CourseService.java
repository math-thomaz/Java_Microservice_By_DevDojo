package com.maththomaz.microservice.endpoint.service;

import com.maththomaz.microservice.model.Course;
import com.maththomaz.microservice.repository.ICourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final ICourseRepository courseRepository;
    public Iterable<Course> list (Pageable pageable) {
        log.info("Listing all courses");
        return courseRepository.findAll(pageable);
    }
}
