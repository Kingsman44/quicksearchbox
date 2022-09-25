package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_AutocompleteSessionToken  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_AutocompleteSessionToken extends AutocompleteSessionToken {

    /* renamed from: a */
    public final ParcelUuid f85517a;

    public C$AutoValue_AutocompleteSessionToken(ParcelUuid parcelUuid) {
        if (parcelUuid != null) {
            this.f85517a = parcelUuid;
            return;
        }
        throw new NullPointerException("Null UUID");
    }

    /* renamed from: a */
    public final ParcelUuid mo37477a() {
        return this.f85517a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutocompleteSessionToken) {
            return this.f85517a.equals(((AutocompleteSessionToken) obj).mo37477a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f85517a.hashCode() ^ 1000003;
    }
}
