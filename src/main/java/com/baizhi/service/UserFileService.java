package com.baizhi.service;

import com.baizhi.entity.UserFile;

import java.util.List;

public interface UserFileService {
    List<UserFile> findByUserID(Integer id);

    void save(UserFile userFile);

    UserFile findById(String id);

    void update(UserFile userFile);

    void delete(String id);
}
