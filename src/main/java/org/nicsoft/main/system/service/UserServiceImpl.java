/**
 * 
 */
package org.nicsoft.main.system.service;

import java.util.List;

import org.nicsoft.main.system.entity.UserInfo;
import org.nicsoft.main.system.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gengyiding
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	/* (non-Javadoc)
	 * @see org.nicsoft.main.system.service.UserService#findAll()
	 */
	@Override
	public List<UserInfo> findAll() {
		
		return userMapper.findAll();
	}

	/* (non-Javadoc)
	 * @see org.nicsoft.main.system.service.UserService#findOne(int)
	 */
	@Override
	public UserInfo findOne(int id) {
		
		return userMapper.findOne(id);
	}

}
