package com.tzh.cs.service;

import com.tzh.cs.entity.staff.CustomerStaff;
import com.tzh.cs.infrastructure.exception.BizException;
import com.tzh.cs.infrastructure.page.PageObject;

import java.util.List;

public interface ICustomerStaffService{

    PageObject<CustomerStaff> findCustomerStaffs(Long pageSize, Long pageIndex);

    List<CustomerStaff> findCustomerStaffs();

    PageObject<CustomerStaff> findCustomerStaffsByName(String staffName, Long pageSize, Long pageIndex);

    CustomerStaff findCustomerStaffById(Long staffId);

    Boolean createCustomerStaff(CustomerStaff customerStaff) throws BizException;

    Boolean updateCustomerStaff(CustomerStaff customerStaff);

    Boolean deleteCustomerStaffById(Long staffId);

    //PULL模式：获取OutsourcingSystem中的CustomerStaff
    void syncOutsourcingCustomerStaffsBySystemId(Long systemId);

}
