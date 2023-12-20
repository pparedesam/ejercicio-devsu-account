package com.exercise.cuentaservice.movement.aplication.usecase;

import com.exercise.cuentaservice.account.aplication.port.DeleteAccountPort;
import com.exercise.cuentaservice.account.domain.repository.DeleteAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteMovementUseCase implements DeleteAccountPort {

    @Autowired
    DeleteAccountRepository deleteAccountRepository;

    @Override
    public void deleteById(Long idMovement) {
            deleteAccountRepository.deleteById(idMovement);
    }
}
