package com.fjw.service.impl;

import com.fjw.domain.Condition;
import com.fjw.domain.PageBean;
import com.fjw.domain.Petinfo;
import com.fjw.mapper.PetinfoMapper;
import com.fjw.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetinfoMapper petinfoMapper;

    /*查询所有宠物*/
    @Override
    public List<Petinfo> findAllPets() {
        return petinfoMapper.findAllPets();
    }

    /*添加宠物*/
    @Override
    public void addPetinfo(Petinfo petinfo) {
        petinfoMapper.insertPet(petinfo);
    }

    /*登录：查找宠物*/
    @Override
    public Petinfo findPet(Petinfo petinfo) {
        return petinfoMapper.findPet(petinfo);
    }

    //通过id查询宠物
    @Override
    public Petinfo findPetById(Integer petId) {
        return petinfoMapper.selectByPrimaryKey(petId);
    }

    //喂食
    @Override
    public void updatePetByFeed(Integer petId) {
        petinfoMapper.updatePetByFeed(petId);
    }

    //讲故事
    @Override
    public void updatePetByStory(Integer petId) {
        petinfoMapper.updatePetByStory(petId);
    }

    //游戏
    @Override
    public void updatePetByGame(Integer petId) {
        petinfoMapper.updatePetByGame(petId);
    }

    //按条件查询所有宠物,并分页
    @Override
    public PageBean findPetsPage(Integer currPage,Integer pSize,Condition condition,HttpServletRequest request) {
        //初始化每页显示的记录数4
        int pageSize=4;
        if(pSize!=null){
            pageSize=pSize;
        }
        System.out.println("新的每页显示条数："+pageSize);
        //初始化当前页为第一页
        int currentPage=1;
        if(currPage!=null){
            currentPage=currPage;
        }
        System.out.println("新的当前页："+currentPage);

        //从session中取出查找条件
        if(condition.getPetinfo()==null){
            Petinfo petinfo = (Petinfo) request.getSession().getAttribute("petinfo");
            condition.setPetinfo(petinfo);
        }

        //按条件查出的所有宠物的数量
        int count=petinfoMapper.count(condition);
        System.out.println("实现类--按条件查询总数:"+count);
        //总页数
        int totalPage=count%pageSize==0?count/pageSize:count/pageSize+1;

        int start=(currentPage-1)*pageSize;
        System.out.println("当前页："+currentPage);
        System.out.println("分页查询的开始位置："+start);
        //将变量封装到PageBean中
        PageBean pageBean=new PageBean(totalPage,currentPage,pageSize,count,start);


        //按条件查出的所有宠物（分页）
        List<Petinfo> petinfos= petinfoMapper.findPetsPage(condition);
        System.out.println("实现类--按条件查询所有宠物集合:"+petinfos);
        pageBean.setPetinfos(petinfos);

        return pageBean;
    }



    /*@Override
    public List<Petinfo> findPetPage(Condition condition) {
        return petinfoMapper.findPetPage(condition);
    }*/

}
