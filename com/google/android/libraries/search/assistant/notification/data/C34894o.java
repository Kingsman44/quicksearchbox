package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.o */
/* compiled from: PG */
final class C34894o {
    /* renamed from: a */
    public static final Optional m63749a(Parcel parcel) {
        long readLong = parcel.readLong();
        return readLong < 0 ? Optional.empty() : Optional.m71637of(Long.valueOf(readLong));
    }

    /* renamed from: b */
    public static final void m63750b(Optional optional, Parcel parcel) {
        parcel.writeLong(((Long) optional.orElse(-1L)).longValue());
    }
}
