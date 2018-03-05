package com.fjw.service.impl;

import com.fjw.domain.Petdiary;
import com.fjw.mapper.PetdiaryMapper;
import com.fjw.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl implements DiaryService{
    @Autowired
    private PetdiaryMapper petdiaryMapper;
    @Override
    public void addDiary(Petdiary petDiary) {
        petdiaryMapper.addDiary(petDiary);
    }
}
