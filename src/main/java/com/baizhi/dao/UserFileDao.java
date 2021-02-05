package com.baizhi.dao;

import com.baizhi.entity.UserFile;

import java.util.List;

public interface UserFileDao {

    //根据登录用户id获取用户的文件列表信息
    List<UserFile> findByUserID(Integer id);

    //保存文件记录
    void save(UserFile userFile);

    //根据文件id获取文件信息
    UserFile findById(String id);

    void update(UserFile userFile);

    void delete(String id);
}
