package org.yhy.persistence;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.yhy.model.TemplatePojo;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class PersistentImpl implements Persistent<TemplatePojo>{

    private static final String OBJECT_FOLDER;

    static {
        URL resource = PersistentImpl.class.getResource("/");
        String objectFolder = resource.getPath()+"obj/";
        try {
            File file = new File(objectFolder);
            if (!file.exists()){
                file.mkdirs();
            }
        } catch (Exception e) {
            objectFolder = null;
            log.error("初始化异常",e);
        }
        OBJECT_FOLDER = objectFolder;
    }

    /**
     * java 序列化
     * @param obj
     * @return
     */
    @Override
    public int save(TemplatePojo obj) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        obj.setId(uuid);
        try {
            FileOutputStream outputStream = new FileOutputStream(OBJECT_FOLDER + TemplatePojo.class.getName() + "#" + obj.getId());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return 0;
    }

    @Override
    public TemplatePojo get(String id) {
        Object o;
        try {
            FileInputStream inputStream = new FileInputStream(OBJECT_FOLDER + TemplatePojo.class.getName() + "#" + id);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            o = objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return (TemplatePojo) o;
    }

    @Override
    public List<TemplatePojo> queryAll() {
        return null;
    }
}
