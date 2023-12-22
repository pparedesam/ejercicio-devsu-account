package com.exercise.cuentaservice.account.aplication.port;

import com.exercise.cuentaservice.account.aplication.dtos.AccountRequestDto;
import com.exercise.cuentaservice.account.aplication.dtos.AccountResponseDto;
import com.exercise.cuentaservice.account.domain.entities.Account;

public interface CreateAccountPort {
    AccountResponseDto execute(AccountRequestDto account);
}
