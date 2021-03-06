package com.shixian.android.client.utils;

import android.content.Context;

import com.shixian.android.client.activities.MainActivity;

/**
 * Created by s0ng on 2015/2/9.
 * 本地缓存采用缓存第一页 也放在这个类中
 */
public class SharedPerenceUtil {

    //用于一些本地缓存操作的存取

    /**
     * 存入 Me信息的工具方法
     * @param context
     * @param userinfo
     */
    public static void putUserInfo(Context context,String userinfo)
    {
        context.getSharedPreferences("userinfo",context.MODE_PRIVATE).edit().putString("userjson",userinfo);

    }

    public static String getUserInfo(Context context)
    {
        return context.getSharedPreferences("userinfo",context.MODE_PRIVATE).getString("userjson","");
    }


    /**
     * 缓存我的项目数据
     */
    public static String getMyProject(Context context)
    {
        return context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("myproject","");
    }

    /**
     * 保存我的项目数据到本地
     */
    public static void putMyProject(Context context,String json)
    {
        context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("myproject",json);

    }


    /**
     * 缓存首页数据
     * @param context
     * @param json
     */
    public static void putIndexFeed(Context context,String json)
    {
        context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("indexdata",json).commit();
    }

    /**
     * 获取首页缓存数据
     * @param context
     * @return
     */
    public static String getIndexFeed(Context context)
    {
        return    context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("indexdata","");
    }


    public static void putUserIndexFeed(Context context,String json,String userid){
        context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("userindexdata"+userid,json).commit();
    }

    /**
     * 缓存用户首页
     * @param context
     * @return
     */
    public static String getUserIndexFeed(MainActivity context,String userid) {
        return    context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("userindexdata"+userid,"");
    }


    /**
     * 缓存用户信息
     * @param context
     * @param json
     */
    public static void putUserIndexInfo(Context context,String json,String userid){
        context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("userifo"+userid,json).commit();
    }

    /**
     * 缓存用户首页
     * @param context
     * @return
     */
    public static String getUserIndexInfo(Context context,String userid) {
        return    context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("userifo"+userid,"");
    }

    public static String getProjectIndexFeed(Context context, int id) {
        return context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("projectFeed"+id,"");
    }

    public static String getProjectIndexInfo(Context context, String id) {

        return context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("projectIndexinfo"+id,"");
    }

    public static void putProjectIndexFeed(Context context, String json,int id) {
         context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("projectFeed"+id,json).commit();
    }

    public static void putProjectIndexInfo(Context context,String json, int id) {
        context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("projectIndexinfo"+id,json).commit();
    }

    public static String getProjectDiscoryProject(Context context) {
        return context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("descoryproject","");
    }

    public static void putProjectDiscoryProject(Context context, String json) {
        context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("descoryproject",json).commit();
    }

    public static String getNews(Context context) {

        return context.getSharedPreferences("cachedate",context.MODE_PRIVATE).getString("news","");
    }

    public static void putNews(Context context, String temp) {
        context.getSharedPreferences("cachedate",context.MODE_PRIVATE).edit().putString("news",temp).commit();
    }
}
