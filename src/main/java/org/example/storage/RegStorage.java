package org.example.storage;

import org.example.dto.RegDTO;
import org.example.storage.api.IRegStorage;
import java.util.ArrayList;
import java.util.List;

public class RegStorage implements IRegStorage {
    private final static RegStorage instance = new RegStorage();

    private List<String> login = new ArrayList<>();
    private List<String> password = new ArrayList<>();
    private List<String> name = new ArrayList<>();
    private List<String> birthday = new ArrayList<>();
    private List<String> datereg = new ArrayList<>();
    private List<String> role = new ArrayList<>();


    private RegStorage() {
    }

    @Override
    public void create(RegDTO data){
        login.add(data.getLogin());
        password.add(data.getPassword());
        name.add(data.getName());
        birthday.add(data.getBirthday());
        datereg.add(data.getDatereg());
        role.add(data.getRole());

    }

    public static RegStorage getInstance() {
        return instance;
    }
}
