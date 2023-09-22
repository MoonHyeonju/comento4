package com.devfun.settingweb_boot.test;

import com.devfun.settingweb_boot.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class settingTest {

    @Autowired
    private StatisticService service;

    @ResponseBody
    @RequestMapping("/sqlyearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception {
        return service.yearloginNum(year);
    }

    @ResponseBody
    @RequestMapping("/monthLogin")
    public Map<String, Object> sqltest2(String month) throws Exception {
        return service.monthloginNum(month);
    }

    @ResponseBody
    @RequestMapping("/dayLogin")
    public Map<String, Object> sqltest3(String day) throws Exception {
        return service.dayloginNum(day);
    }

    @ResponseBody
    @RequestMapping("/averageLogin")
    public Map<String, Object> sqltest4(String day) throws Exception {
        return service.averageloginNum(day);
    }

    @ResponseBody
    @RequestMapping("/monthDepartmentLogin")
    public Map<String, Object> sqltest5(String month) throws Exception {
        return service.monthlyByDepartmentloginNum(month);
    }
    
    
    @RequestMapping("/test")
    public ModelAndView test() throws Exception {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "devfunpj");
        ArrayList<String> resultList = new ArrayList<>();
        resultList.add("!!!HELLO WORLD!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!!!");
        resultList.add("설정 TEST!!!!!!");
        mav.addObject("list", resultList);
        return mav;
    }
}
