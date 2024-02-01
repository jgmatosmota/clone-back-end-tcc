package com.example.b2b.services;

import com.example.b2b.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutorizacaoService implements UserDetailsService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return empresaRepository.findByEmail(username);
    }
}
