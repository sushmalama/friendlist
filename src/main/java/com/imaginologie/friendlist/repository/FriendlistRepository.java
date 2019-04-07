package com.imaginologie.friendlist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imaginologie.friendlist.entity.Friendlist;

	@Repository
	public interface FriendlistRepository extends JpaRepository<Friendlist, Long>{

		

	}

