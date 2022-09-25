package com.google.android.hotword.service;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.hotword.service.b */
/* compiled from: PG */
final class C146584b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new HotwordInformation(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordInformation[i];
    }
}
