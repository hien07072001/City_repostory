package com.codegym.cms.service.appuser;

import com.codegym.cms.model.AppUser;
import com.codegym.cms.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class AppUserServiceImpl implements AppUserService, UserDetailsService {

    @Autowired
    private AppUserRepository appUserRepository;
    @Override
    public AppUser getUseUserName(String username) {
        return appUserRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AppUser user=this.getUseUserName(username);

        List<GrantedAuthority> authorities=new ArrayList<>();
        authorities.add( user.getUserRole());

        UserDetails userDetails= new User(
                user.getUsername(),
                user.getPassword(),
                authorities

        );
        return userDetails;
    }
}
