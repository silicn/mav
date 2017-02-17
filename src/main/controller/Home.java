package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JiaHao on 2017/2/14.
 */

@Controller
public class Home {

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public  @ResponseBody
    ArrayList<String> list(){
        ArrayList<String> array = new ArrayList<String>();
        array.add("test");
        array.add("test2");
        return  array;
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public  @ResponseBody People user(){
        People p = new People();
        p.setAge("16");
        p.setName("lily");
        return p;
    }


    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseBody
    public  String home(){
        return  "home";
    }



    @RequestMapping(value="/userself")
    public ModelAndView index(){
        Map<String, String> map = new HashMap<String, String>();

//        map.put("name","silicn");
//        map.put("nihao","nihao");

        ModelAndView modelAndView = new ModelAndView("/myName");
        modelAndView.addObject("name", "Silicn");
        modelAndView.addObject("nihao","Hello：");
        return modelAndView;
    }


    @RequestMapping(value = "/hehe",method = RequestMethod.GET)

    public  String hehe(ModelMap map){
        map.addAttribute("name","silicn");
        map.put("nihao","shi");
        return "shiguanghui";
    }



}
