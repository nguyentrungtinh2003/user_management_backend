package com.TrungTinhBackend.user_management_backend.Service.Jwt;

import com.TrungTinhBackend.user_management_backend.Entity.User;
import com.TrungTinhBackend.user_management_backend.Exception.NotFoundException;
import com.TrungTinhBackend.user_management_backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null) {
            throw new NotFoundException("User not found");
        }
        return user;
    }
}
