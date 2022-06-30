package com.project.projectManagement.service.impl;

import com.project.projectManagement.domain.User;
import com.project.projectManagement.domain.UserPrincipal;
import com.project.projectManagement.repository.UserRepository;
import com.project.projectManagement.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Qualifier("UserDetailsService")
public class UserServiceImpl implements UserService  , UserDetailsService {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        if(user == null ){
            LOGGER.error("User not found by userName:" + username);
            throw new UsernameNotFoundException("User not Found by username" + username );
        }
        else{
            userRepository.save(user);
            UserPrincipal userPrincipal = new UserPrincipal(user);
            LOGGER.info("Returning Found User by username:" + username);
            return userPrincipal;
        }

    }
}
