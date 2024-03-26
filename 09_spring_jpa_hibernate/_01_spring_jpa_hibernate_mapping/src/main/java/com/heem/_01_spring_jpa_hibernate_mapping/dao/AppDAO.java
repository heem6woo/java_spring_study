package com.heem._01_spring_jpa_hibernate_mapping.dao;

import com.heem._01_spring_jpa_hibernate_mapping.entity.Instructor;

public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);


}
