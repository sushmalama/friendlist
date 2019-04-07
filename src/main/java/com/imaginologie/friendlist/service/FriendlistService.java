package com.imaginologie.friendlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginologie.friendlist.FriendlistDto;
import com.imaginologie.friendlist.entity.Friendlist;
import com.imaginologie.friendlist.repository.FriendlistRepository;

@Service
public class FriendlistService {

	@Autowired
	FriendlistRepository friendlistRepository;
	
	public List<Friendlist> createFriendlist(FriendlistDto friendlistDto) {
		Friendlist friendlist = new Friendlist();
		friendlist.setGender(friendlistDto.getGender());
		friendlist.setName(friendlistDto.getName());
		friendlist.setNo(friendlistDto.getNo());
		friendlistRepository.save(friendlist);
		List<Friendlist> friendlists = friendlistRepository.findAll();
		return friendlists;
	}

	public List<Friendlist> getAllFriendlists() {
		return friendlistRepository.findAll();
	}

	public void deleteFriendlist(Long id) {
		friendlistRepository.deleteById(id);
	}
	public FriendlistDto getFriendlist(Long id) {
		Friendlist friendlist = friendlistRepository.getOne(id);
		FriendlistDto friendlistDto = new FriendlistDto();
		friendlistDto.setNo(friendlist.getNo());
		friendlistDto.setName(friendlist.getName());
		
		return friendlistDto;
		
	}
	
}
