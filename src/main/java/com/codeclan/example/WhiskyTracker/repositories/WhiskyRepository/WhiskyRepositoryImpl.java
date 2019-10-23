package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;


import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    public List <Whisky> findAllByDistilleryAndAge(Long distId, int whiskyAge) {
        return null;
    }
}
