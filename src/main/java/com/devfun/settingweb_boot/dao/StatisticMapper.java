package com.devfun.settingweb_boot.dao;

import java.util.HashMap;

public interface StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectMonthLogin(String month);
    public HashMap<String, Object> selectDayLogin(String day);
    public HashMap<String, Object> selectAverageOfDailyLogin(String day);
    public HashMap<String, Object> selectExceptHolidayLogin();
    public HashMap<String, Object> selectMonthlyByDepartmentLogin(String month);

}
