package edu.epitech.flight.services.impl;

import edu.epitech.flight.dto.AccountDto;
import edu.epitech.flight.models.Account;
import edu.epitech.flight.repositories.AccountRepository;
import edu.epitech.flight.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public AccountServiceImpl() {

    }

    @Override
    public Account addAccount(AccountDto accountDto) {
        Account account = new Account();
        account.setEmail(accountDto.getEmail());
        account.setPassword(passwordEncoder.encode(accountDto.getPassword()));
        account.setUsername(accountDto.getUsername());
        account.setConfirmPassword(passwordEncoder.encode(accountDto.getConfirmPassword()));
        return accountRepository.save(account);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
