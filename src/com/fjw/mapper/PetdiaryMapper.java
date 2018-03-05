package com.fjw.mapper;

import com.fjw.domain.Condition;
import com.fjw.domain.Petdiary;
import com.fjw.domain.PetdiaryExample;
import com.fjw.domain.Petinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetdiaryMapper {
    int countByExample(PetdiaryExample example);

    int deleteByExample(PetdiaryExample example);

    int deleteByPrimaryKey(Integer diaryId);

    int insert(Petdiary record);

    int insertSelective(Petdiary record);

    List<Petdiary> selectByExample(PetdiaryExample example);

    Petdiary selectByPrimaryKey(Integer diaryId);

    int updateByExampleSelective(@Param("record") Petdiary record, @Param("example") PetdiaryExample example);

    int updateByExample(@Param("record") Petdiary record, @Param("example") PetdiaryExample example);

    int updateByPrimaryKeySelective(Petdiary record);

    int updateByPrimaryKey(Petdiary record);

    Petinfo findPet(Petinfo petinfo);

    void addDiary(Petdiary petDiary);
    List<Petinfo> findPetsPage(Condition condition);
}