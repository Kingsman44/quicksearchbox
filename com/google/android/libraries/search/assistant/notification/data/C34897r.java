package com.google.android.libraries.search.assistant.notification.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.r */
/* compiled from: PG */
final class C34897r {
    /* renamed from: a */
    public static final Optional m63754a(Parcel parcel) {
        return Optional.ofNullable((Uri) parcel.readParcelable(Uri.class.getClassLoader()));
    }

    /* renamed from: b */
    public static final void m63755b(Optional optional, Parcel parcel) {
        parcel.writeParcelable((Parcelable) optional.orElse(null), 0);
    }
}
