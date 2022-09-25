package com.google.android.libraries.search.assistant.notification.data;

import android.os.Parcel;
import android.text.TextUtils;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.n */
/* compiled from: PG */
final class C34893n {
    /* renamed from: a */
    public static final Optional m63747a(Parcel parcel) {
        return Optional.ofNullable((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
    }

    /* renamed from: b */
    public static final void m63748b(Optional optional, Parcel parcel) {
        TextUtils.writeToParcel((CharSequence) optional.orElse(null), parcel, 0);
    }
}
