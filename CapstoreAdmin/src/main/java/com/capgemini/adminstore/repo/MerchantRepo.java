package com.capgemini.adminstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.adminstore.beans.Merchant;
@Repository
public interface MerchantRepo extends JpaRepository<Merchant, Integer>{

	
	
}
