package com.samsung.hakaton2024.domain;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.function.Consumer;

import com.samsung.hakaton2024.domain.entites.ItemUserEntity;
import com.samsung.hakaton2024.domain.entites.FullUserEntity;
import com.samsung.hakaton2024.domain.entites.Status;


public interface UserRepository {
    void getAllUsers(@NonNull Consumer<Status<List<ItemUserEntity>>> callback);

    void getUser(@NonNull String id, @NonNull Consumer<Status<FullUserEntity>> callback);
}
