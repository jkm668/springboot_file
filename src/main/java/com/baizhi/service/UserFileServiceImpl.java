package com.baizhi.service;

import com.baizhi.dao.UserFileDao;
import com.baizhi.entity.UserFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserFileServiceImpl implements UserFileService{

    @Autowired
    private UserFileDao userFileDao;

    @Override
    public List<UserFile> findByUserID(Integer id) {
        return userFileDao.findByUserID(id);
    }

    @Override
    public void save(UserFile userFile) {
        //是否是图片  解决方案：当类型中含有image时说明当前类型一定为图片类型
        String isImg = userFile.getType().startsWith("image") ? "是" : "否";
        userFile.setIsImg(isImg);
        userFile.setDowncounts(0);
        userFile.setUploadTime(new Date());
        userFileDao.save(userFile);
    }

    @Override
    public UserFile findById(String id) {
       return userFileDao.findById(id);
    }

    @Override
    public void update(UserFile userFile) {
        userFileDao.update(userFile);
    }

    @Override
    public void delete(String id) {
        userFileDao.delete(id);
    }
}
