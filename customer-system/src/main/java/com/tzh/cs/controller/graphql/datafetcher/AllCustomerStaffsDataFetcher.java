package com.tzh.cs.controller.graphql.datafetcher;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tzh.cs.entity.staff.CustomerStaff;
import com.tzh.cs.mapper.CustomerStaffMapper;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllCustomerStaffsDataFetcher  implements DataFetcher<List<CustomerStaff>> {

    @Autowired
    private CustomerStaffMapper customerStaffMapper;

    @Override
    public List<CustomerStaff> get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {

        LambdaQueryWrapper<CustomerStaff> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(CustomerStaff::getIsDeleted, false);
        return customerStaffMapper.selectList(queryWrapper);
    }
}
