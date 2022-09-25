package com.google.android.hotword.service;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.hotword.service.f */
/* compiled from: PG */
final class C146588f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new HotwordSettings(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordSettings[i];
    }
}
