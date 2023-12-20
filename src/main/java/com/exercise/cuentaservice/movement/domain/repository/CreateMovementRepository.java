package com.exercise.cuentaservice.movement.domain.repository;

import com.exercise.cuentaservice.account.domain.entities.Account;
import com.exercise.cuentaservice.movement.domain.entities.Movement;

public interface CreateMovementRepository {

    Movement create(Movement movement);
}