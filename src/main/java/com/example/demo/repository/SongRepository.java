package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Song;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long>{
}
