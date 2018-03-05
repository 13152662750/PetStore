package com.fjw.service;

import com.fjw.domain.Condition;
import com.fjw.domain.PageBean;
import com.fjw.domain.Petinfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface PetService {
    List<Petinfo> findAllPets();

    void addPetinfo(Petinfo petinfo);

    Petinfo findPet(Petinfo petinfo);

    Petinfo findPetById(Integer petId);


    void updatePetByFeed(Integer petId);

    void updatePetByStory(Integer petId);

    void updatePetByGame(Integer petId);

    PageBean findPetsPage(Integer currentPage,Integer pageSize,Condition condition,HttpServletRequest request);

   /* List<Petinfo> findPetPage(Condition condition);*/

}
