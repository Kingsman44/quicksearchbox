package com.google.android.libraries.appactions.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.appactions.service.d */
/* compiled from: PG */
final class C147862d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        return new AutoValue_ShortcutLookupRequest(readBundle.getString("1"), readBundle.getString("2"), readBundle.getString("3"));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ShortcutLookupRequest[i];
    }
}
