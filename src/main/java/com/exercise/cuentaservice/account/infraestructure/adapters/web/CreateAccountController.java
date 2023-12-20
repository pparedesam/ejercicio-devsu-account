package com.exercise.cuentaservice.account.infraestructure.adapters.web;

import com.exercise.cuentaservice.account.aplication.port.CreateAccountPort;
import com.exercise.cuentaservice.account.domain.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/account")
public class CreateAccountController {

    @Autowired
    private CreateAccountPort createAccountPort;


    @PostMapping()
    public ResponseEntity createAccount(@RequestBody Account account)
    {
        createAccountPort.execute(account);
        return ResponseEntity.ok().build();
    }
}
