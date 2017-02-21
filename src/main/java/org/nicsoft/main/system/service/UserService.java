/**
 * 
 */
package org.nicsoft.main.system.service;

import java.util.List;

import org.nicsoft.main.system.entity.UserInfo;

/**
 * @author gengyiding
 *
 */
public interface UserService {
	
	/**
	 * findAll
	 * @return
	 */
	List<UserInfo> findAll();
	
	UserInfo findOne(int id);

}
