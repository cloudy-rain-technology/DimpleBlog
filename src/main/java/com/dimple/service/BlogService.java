package com.dimple.service;

import com.dimple.bean.Blog;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: BlogService
 * @Description:
 * @Auther: Owenb
 * @Date: 12/12/18 14:56
 * @Version: 1.0
 */
public interface BlogService {
    /**
     * 获得所有的Blog信息
     *
     * @param title
     * @param startTime
     * @param endTime
     * @param status
     * @return
     */
    List<Blog> selectAllBlog(String title, Date startTime, Date endTime, Integer status);

    /**
     * 新增博客
     *
     * @param blog
     * @return
     */
    int addBlog(Blog blog);

    /**
     * 删除Blog
     *
     * @param blogId
     * @return
     */
    int deleteBlog(Integer blogId);

    /**
     * 更新博客的信息
     *
     * @param blog
     * @return
     */
    int updateBlog(Blog blog);

    /**
     * 更换博客的状态
     *
     * @param id     博客的id
     * @param status 将要切换的状态（1表示发布，2表示草稿箱，3表示回收站）
     * @return
     */
    int changeBlogStatus(Integer id, Integer status);

    /**
     * 根据Blog的Id获取Blog信息
     *
     * @param id
     * @return
     */
    Blog selectBlogById(Integer id);

    /**
     * 获取博客状态的统计（有多少是已经发布了的，有多少是已经在草稿箱，有多少是在垃圾箱）
     *
     * @return
     */
    Map<String, Integer> selectCountOfBlogStatus();
}
