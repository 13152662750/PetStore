package com.fjw.mapper;

import com.fjw.domain.Condition;
import com.fjw.domain.PageBean;
import com.fjw.domain.Petinfo;
import com.fjw.domain.PetinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /*查询全部宠物*/
    List<Petinfo> findAllPets();

    /*注册宠物*/
    void insertPet(Petinfo petinfo);

    /*查找宠物*/

    Petinfo findPet(Petinfo petinfo);
    

    /*喂食*/
    void updatePetByFeed(Integer petId);

    void updatePetByStory(Integer petId);

    void updatePetByGame(Integer petId);

    //按条件查询所有宠物
    List<Petinfo> findPetsPage(Condition condition);

    int count(Condition condition);
}