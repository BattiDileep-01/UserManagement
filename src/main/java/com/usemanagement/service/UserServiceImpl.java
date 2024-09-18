package com.usemanagement.service;

import com.usemanagement.dto.LoginDTO;
import com.usemanagement.dto.RegistrationDTO;
import com.usemanagement.dto.ResetPwdDTO;
import com.usemanagement.dto.UserDTO;
import com.usemanagement.entity.CityEntity;
import com.usemanagement.entity.CountryEntity;
import com.usemanagement.entity.StateEntity;
import com.usemanagement.entity.UserEntity;
import com.usemanagement.exceptions.CityIdNotFound;
import com.usemanagement.exceptions.CountryIdNotFound;
import com.usemanagement.exceptions.StateIdNotFound;
import com.usemanagement.repository.CityRepo;
import com.usemanagement.repository.CountryRepo;
import com.usemanagement.repository.StateRepo;
import com.usemanagement.repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userrepo;

    @Autowired
    private CountryRepo countryrepo;

    @Autowired
    private StateRepo staterepo;

    @Autowired
    private CityRepo cityrepo;

    @Override
    public Boolean register(RegistrationDTO registerdto) {

        UserEntity user = new UserEntity();
        BeanUtils.copyProperties(registerdto, user);

        CountryEntity country = countryrepo.findById(registerdto.getCountryId())
                .orElseThrow(() -> new CountryIdNotFound("country id not found :" + registerdto.getCountryId()));
        user.setCountry(country);

        StateEntity state = staterepo.findById(registerdto.getStateId())
                .orElseThrow(() -> new StateIdNotFound("state id not fond" + registerdto.getStateId()));
        user.setState(state);

        CityEntity city = cityrepo.findById(registerdto.getCityId())
                .orElseThrow(() -> new CityIdNotFound("city id not found :" + registerdto.getCityId()));
        user.setCity(city);

        user.setPhno(registerdto.getPhno());

        user.setEmail(registerdto.getEmail());

        String generatedrandompwd = randomPwd();
        user.setPwd(generatedrandompwd);

        user.setUpdatePwd("NO");


        userrepo.save(user);
        if(user.getUserId() != null){
            return true;
        }
        return false;
    }

    @Override
    public UserDTO login(LoginDTO logindto) {

        UserDTO userdto =new UserDTO();
        UserEntity user = userrepo.findByEmailAndPwd(logindto.getEmail(), logindto.getPwd());
        if (user != null){

            BeanUtils.copyProperties(user , userdto);
            return userdto;
        }else
        return null;
    }

    public String randomPwd(){

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXVXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";

        String pwd =upper +lower;
        Random r=new Random();
        StringBuffer geberatepwd = new StringBuffer();

        for(int i =0;i<5 ;i++){

            int index = r.nextInt(pwd.length());
            geberatepwd.charAt(index);

        }
        return randomPwd().toString();
    }

}
