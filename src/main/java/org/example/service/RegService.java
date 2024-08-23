package org.example.service;

import org.example.dto.RegDTO;
import org.example.service.api.IRegService;
import org.example.storage.RegStorage;
import org.example.storage.api.IRegStorage;

public class RegService implements IRegService {
    private final static RegService instance = new RegService();
    private final static IRegStorage dStorage = RegStorage.getInstance();

    private RegService() {
    }

    @Override
    public void create(RegDTO data) {
        if(data.getLogin() == null || data.getLogin().isBlank()){
            throw new IllegalArgumentException("Логин пуст");
        }
        dStorage.create(data);
    }
    public static RegService getInstance(){
        return instance;
    }
}

