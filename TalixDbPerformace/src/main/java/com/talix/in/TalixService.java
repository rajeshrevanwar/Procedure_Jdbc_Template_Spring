package com.talix.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalixService {

	@Autowired
	TalixDao talixDao;

	public void addData() {
		talixDao.addData();
	}

	public void deleteData() {
		talixDao.deleteData();
	}
	
}
