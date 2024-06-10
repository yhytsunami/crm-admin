package org.yhy.persistence;

import org.springframework.stereotype.Service;
import org.yhy.model.TemplatePojo;

import java.util.List;

@Service
public class PersistentImpl implements Persistent<TemplatePojo>{

    @Override
    public int save(TemplatePojo obj) {
        return 0;
    }

    @Override
    public TemplatePojo get(String id) {
        return null;
    }

    @Override
    public List<TemplatePojo> queryAll() {
        return null;
    }
}
