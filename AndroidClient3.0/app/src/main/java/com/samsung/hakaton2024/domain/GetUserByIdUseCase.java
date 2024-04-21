package com.samsung.hakaton2024.domain;

import androidx.annotation.NonNull;

import java.util.function.Consumer;

import com.samsung.hakaton2024.domain.entites.FullUserEntity;
import com.samsung.hakaton2024.domain.entites.Status;

public class GetUserByIdUseCase {
    private final UserRepository repo;

    public GetUserByIdUseCase(UserRepository repo) {
        this.repo = repo;
    }

    public void execute(@NonNull String id, @NonNull Consumer<Status<FullUserEntity>> callback) {
        repo.getUser(id, callback);
    }
}
