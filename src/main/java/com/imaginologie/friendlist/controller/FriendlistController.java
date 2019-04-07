package com.imaginologie.friendlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imaginologie.friendlist.FriendlistDto;
import com.imaginologie.friendlist.entity.Friendlist;
import com.imaginologie.friendlist.service.FriendlistService;
	@RestController
	@RequestMapping("/friendlists")
	public class FriendlistController {

		@Autowired
		FriendlistService friendlistService;
		
		@RequestMapping(value="/getAllfriendlist", method=RequestMethod.GET)
		public List<Friendlist> getAllFriendlist(){
			return friendlistService.getAllFriendlists();
		}
		@RequestMapping (value="/{friendlistNo}",method=RequestMethod.DELETE)
		public void deleteFriendlist(@PathVariable Long no) {
			friendlistService.deleteFriendlist(no);
		}
		@RequestMapping(method=RequestMethod.POST)
		@ResponseStatus(code=HttpStatus.CREATED)
		public List <Friendlist> createFriendlist(@RequestBody FriendlistDto friendlist){
			return friendlistService.createFriendlist(friendlist);

		}
		
	}




