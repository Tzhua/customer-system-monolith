package com.tzh.cs.converter;

import com.tzh.cs.controller.vo.req.AddOutsourcingSystemReqVO;
import com.tzh.cs.controller.vo.resp.OutsourcingSystemRespVO;
import com.tzh.cs.entity.tenant.OutsourcingSystem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OutsourcingSystemConverter {

    OutsourcingSystemConverter INSTANCE = Mappers.getMapper(OutsourcingSystemConverter.class);

    //VO->Entity
    OutsourcingSystem convertCreateReq(AddOutsourcingSystemReqVO addOutsourcingSystemReqVO);

    //Entity->VO
    OutsourcingSystemRespVO convertResp(OutsourcingSystem entity);
    List<OutsourcingSystemRespVO> convertListResp(List<OutsourcingSystem> entities);
}
