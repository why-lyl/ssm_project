package com.team.erp.framework.mapper;

import java.util.List;

import com.team.erp.framework.model.Staff;

public interface StaffMapper {
	
	/**
	 * 查询方法
	 */
	Staff selectStaffByStaffId(Integer StaffId); //根据用户id查询用户
	Staff selectStaffByStaffName(String StaffName);//根据用户名字查询用户
	List<Staff> selectStaffAll();//查询出所有与员工有关的信息
	
	/**
	 * 更新方法
	 */
	
	int updateByPrimaryKeySelective(Staff record);//根据选择的用户信息更新用户
	int updateByPrimaryKey(Staff record);//根据主键更新用户信息
	
	/**
	 * 添加方法
	 */
	
	int addStaff(Staff Staff);//根据用户信息插入用户
	
	/**
	 * 删除方法
	 */
	int deleteStaffByStaffId(Integer StaffId);//根据用户id删除用户
	int deleteStaffByStaffName(String StaffName);//根据用户name删除用户

}