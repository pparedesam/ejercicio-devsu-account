package com.exercise.cuentaservice.account.aplication.usecase;

import com.exercise.cuentaservice.account.aplication.port.GetAccountPort;
import com.exercise.cuentaservice.account.domain.entities.Account;
import com.exercise.cuentaservice.account.domain.repository.GetAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAccountUseCase implements GetAccountPort
{

    @Autowired
    private GetAccountRepository getAccountRepository;

    @Override
    public List<Account> execute() {
        return getAccountRepository.findAll();
    }
}
