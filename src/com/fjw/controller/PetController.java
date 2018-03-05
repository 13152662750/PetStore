package com.fjw.controller;

import com.fjw.domain.Condition;
import com.fjw.domain.PageBean;
import com.fjw.domain.Petinfo;
import com.fjw.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetService petService;

    //进入首页
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    /*领养宠物：注册*/
    @RequestMapping("/register")
    public String addPetinfo(Petinfo petinfo) {
        System.out.println(petinfo.getPetName());
        petService.addPetinfo(petinfo);
        return "index";
    }

    /*登录*/
    @RequestMapping("/login")
    public String login(Petinfo petinfo, Model model) {
        //Petinfo pet = petService.findPetById(petinfo.getPetId());
        Petinfo pet = petService.findPet(petinfo);
        System.out.println(pet);
        if (pet != null && pet.getPetPassword().equals(petinfo.getPetPassword())) {
            model.addAttribute("pet", pet);
            return "pet";
        }
        return "index";
    }

    /*查询所有宠物信息*/
    /*@RequestMapping("/findAll")
    public String findAllPets(Model model) {
        List<Petinfo> petinfos = petService.findAllPets();
        model.addAttribute("petinfos", petinfos);
        return "pet_list";
    }*/

    /*trainingType*/
    @RequestMapping("/train")
    public String feed(Integer petId,String trainingType,Model model){
        System.out.println(petId+"---------"+trainingType);

        if("TRANING_TYPE_FEED".equals(trainingType)){
            petService.updatePetByFeed(petId);//力量加30。每天最多3次。
        }
        if("TRANING_TYPE_STORY".equals(trainingType)){
            petService.updatePetByStory(petId);//讲故事：聪明加1，爱心加3，力量减5。每天最多5次。

        }
        if("TRANING_TYPE_GAME".equals(trainingType)){
            petService.updatePetByGame(petId);//游戏：聪明加3，爱心加1，力量减5。每天最多5次。

        }
        Petinfo pet = petService.findPetById(petId);
        model.addAttribute("pet",pet);
        return "/pet";
    }


    //写宠物日记
    @RequestMapping("write/{id}")
    public String write(@PathVariable Integer id,Model model){
        System.out.println(id);
        Petinfo pet = petService.findPetById(id);
        model.addAttribute("pet",pet);
        return "write_diary";
    }
    /*横向求和加排序：
      SELECT pet_id, pet_name, pet_sex, pet_strength, pet_cute, pet_love, pet_intro, pet_owner_name, pet_owner_email, pet_password, pet_pic, pet_type,
      IFNULL(pet_strength,0)+IFNULL(pet_cute,0)+IFNULL(pet_love,0) AS total FROM petinfo ORDER BY total DESC LIMIT 0,4
    */

    /*按宠物名，宠物类型，主人，查找宠物:*/
    @RequestMapping("findPetByCondition")
    public String findPetByCondition(Integer currentPage,Integer pageSize,Condition condition, Model model,HttpServletRequest request){

        System.out.println("当前页："+currentPage);
        System.out.println("每页显示条数："+pageSize);
        PageBean pets = petService.findPetsPage(currentPage,pageSize,condition,request);

        //将查询条件存到session中
        if(condition.getPageBean()==null){
            Petinfo petinfo = condition.getPetinfo();
            request.getSession().setAttribute("petinfo",petinfo);
        }
        model.addAttribute("pets",pets);
        return "pet_list";
    }

}
