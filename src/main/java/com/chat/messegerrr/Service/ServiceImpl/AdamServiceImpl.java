package com.chat.messegerrr.Service.ServiceImpl;

import com.chat.messegerrr.Entities.Adam;
import com.chat.messegerrr.Repository.AdamRepository;
import com.chat.messegerrr.Service.AdamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdamServiceImpl implements AdamService {
    @Autowired
    private AdamRepository adamRepository;

    @Override
    public Adam createUser(String userName) {
        Adam adam = new Adam();
        adam.setUserName(userName);
        return adamRepository.save(adam);
    }
}
