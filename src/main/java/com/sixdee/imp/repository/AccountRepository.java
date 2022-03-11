package com.sixdee.imp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sixdee.imp.entity.AccountDetail;

public interface AccountRepository extends JpaRepository<AccountDetail,Integer> {

	public AccountDetail save(AccountDetail accountDetail);
}
