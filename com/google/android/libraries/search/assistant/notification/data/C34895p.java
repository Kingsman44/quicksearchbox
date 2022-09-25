package com.google.android.libraries.search.assistant.notification.data;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.p */
/* compiled from: PG */
final class C34895p {
    /* renamed from: a */
    public static final Optional m63751a(Parcel parcel) {
        return Optional.ofNullable((PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader()));
    }

    /* renamed from: b */
    public static final void m63752b(Optional optional, Parcel parcel) {
        parcel.writeParcelable((Parcelable) optional.orElse(null), 0);
    }
}
