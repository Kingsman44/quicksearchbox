package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.UUID;

/* compiled from: PG */
public abstract class AutocompleteSessionToken implements Parcelable {
    /* renamed from: b */
    public static AutocompleteSessionToken m59347b() {
        return new AutoValue_AutocompleteSessionToken(new ParcelUuid(UUID.randomUUID()));
    }

    /* renamed from: a */
    public abstract ParcelUuid mo37477a();

    public final String toString() {
        return mo37477a().toString();
    }
}
