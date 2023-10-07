package com.tzh.cs.service;

import com.tzh.cs.entity.tenant.OutsourcingSystem;
import com.tzh.cs.infrastructure.page.PageObject;

import java.util.List;

public interface IOutsourcingSystemService {

    List<OutsourcingSystem> findAllOutsourcingSystems();

    PageObject<OutsourcingSystem> findPagedOutsourcingSystems(Long pageSize, Long pageIndex);

    OutsourcingSystem findOutsourcingSystemById(Long systemId);

    Boolean addOutsourcingSystem(OutsourcingSystem outsourcingSystem);

    Boolean updateOutsourcingSystem(OutsourcingSystem outsourcingSystem);

    Boolean deleteOutsourcingSystemById(Long systemId);
}
