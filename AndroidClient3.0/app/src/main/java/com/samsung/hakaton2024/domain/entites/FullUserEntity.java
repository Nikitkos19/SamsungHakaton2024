package com.samsung.hakaton2024.domain.entites;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FullUserEntity {
    @NonNull
    private final String id;
    @NonNull
    private final String name;
    @Nullable
    private final String photoUrl;

    public FullUserEntity(
            @NonNull String id,
            @NonNull String name,
            @Nullable String photoUrl,
            @Nullable String email,
            @Nullable String phone
    ) {
        this.id = id;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @Nullable
    public String getPhotoUrl() {
        return photoUrl;
    }

}
