package com.exercise.cuentaservice.movement.aplication.mapper;

import com.exercise.cuentaservice.account.domain.entities.Account;
import com.exercise.cuentaservice.movement.aplication.dtos.MovementRequestDto;
import com.exercise.cuentaservice.movement.aplication.dtos.MovementResponseDto;
import com.exercise.cuentaservice.movement.domain.entities.Movement;

public class MovementMapper {

    public static MovementResponseDto movementToMovementResponseDto(Movement movement) {
        return new MovementResponseDto(
                movement.getAccount().getNumber(),
                movement.getAccount().getTipo(),
                movement.getBalance(),
                movement.getAccount().getState(),
                movement.getTypeMovement() + " de " + String.valueOf(movement.getValue().abs())
        );
    }

    public static Movement movementRequestDtoToMovement(MovementRequestDto dto) {
        return Movement.builder()
                .date(dto.date())
                .account(Account.builder()
                        .id(dto.idAccount())
                        .build())
                .value(dto.value())
                .build();
    }
}
