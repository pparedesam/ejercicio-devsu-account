package com.exercise.cuentaservice.account.aplication.usecase;

import com.exercise.cuentaservice.account.aplication.port.CreateAccountPort;
import com.exercise.cuentaservice.account.domain.entities.Account;
import com.exercise.cuentaservice.account.domain.repository.CreateAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountUseCase implements CreateAccountPort {

    @Autowired
    private CreateAccountRepository createAccountRepository;

    @Override
    public Account execute(Account account) {
        return createAccountRepository.create(account);
    }
}
