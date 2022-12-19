package edu.epitech.flight.services;

import edu.epitech.flight.dto.AccountDto;
import edu.epitech.flight.models.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends UserDetailsService {

    Account addAccount(AccountDto accountDto);
}
