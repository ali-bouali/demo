package com.demo.repositories;

import com.demo.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhotoRepository extends JpaRepository<Photo, Long> {
}
