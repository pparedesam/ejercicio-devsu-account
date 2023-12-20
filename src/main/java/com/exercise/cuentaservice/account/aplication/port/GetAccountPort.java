package com.exercise.cuentaservice.account.aplication.port;

import com.exercise.cuentaservice.account.domain.entities.Account;

import java.util.List;

public interface GetAccountPort {
    List<Account> execute();
}
