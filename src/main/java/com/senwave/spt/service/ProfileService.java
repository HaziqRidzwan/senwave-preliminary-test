package com.senwave.spt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senwave.spt.entity.ProfileModel;
import com.senwave.spt.repository.ProfileRepository;

//inject service into controller
@Service
public class ProfileService {
	//make two form, register and login
	 
	//wire the user repositories
	//Store user in the database by calling a user's repositories save
	
	@Autowired 
	private ProfileRepository profileRepository;
	
	public ProfileService(ProfileRepository profileRepository) {
		super();
		this.profileRepository = profileRepository;
	}

	public ProfileModel registerProfile(String login, String password, String email) {
		if(login == null || password == null) {
			return null;
		} else { 
			//Kalau kotak login dan password bukan empty, code akan continue sini.
			ProfileModel profileModel = new ProfileModel();
			profileModel.setLogin(login);
			profileModel.setPassword(password);
			profileModel.setEmail(email);
			return profileRepository.save(profileModel);
		}
	}
	
	public ProfileModel authenticate (String login, String password) {
		return profileRepository.findByLoginAndPassword(login, password).orElse(null);
	}
}
