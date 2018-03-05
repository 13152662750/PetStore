package com.fjw.mapper;

import com.fjw.domain.Petinfo;
import com.fjw.domain.PetinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetinfoMapper {
    int countByExample(PetinfoExample example);

    int deleteByExample(PetinfoExample example);

    int deleteByPrimaryKey(Integer petId);

    int insert(Petinfo record);

    int insertSelective(Petinfo record);

    List<Petinfo> selectByExample(PetinfoExample example);

    Petinfo selectByPrimaryKey(Integer petId);

    int updateByExampleSelective(@Param("record") Petinfo record, @Param("example") PetinfoExample example);

    int updateByExample(@Param("record") Petinfo record, @Param("example") PetinfoExample example);

    int updateByPrimaryKeySelective(Petinfo record);

    int updateByPrimaryKey(Petinfo record);
}