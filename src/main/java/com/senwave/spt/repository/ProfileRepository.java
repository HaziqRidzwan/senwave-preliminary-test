package com.senwave.spt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senwave.spt.entity.ProfileModel;

public interface ProfileRepository extends JpaRepository<ProfileModel, Integer>{
	Optional<ProfileModel> findByLoginAndPassword(String Login, String password); 
}

//ProfileResopitory interface extend JPARepository class from Data JPA project