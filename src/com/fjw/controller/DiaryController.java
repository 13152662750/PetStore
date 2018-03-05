package com.fjw.controller;

import com.fjw.domain.Petdiary;
import com.fjw.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("diary")
public class DiaryController {
    @Autowired
    private DiaryService diaryService;
    /*添加日志*/
    @RequestMapping("addDiary")
    public String addDiary(Petdiary petDiary,String operate) throws ParseException {
        //手动添加日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(new Date());
        Date date1 = sdf.parse(date);

        petDiary.setDiaryDate(date1);
        petDiary.setDiaryLastModify(date1);

        System.out.println(petDiary);
        diaryService.addDiary(petDiary);
        return "index";
    }


}
