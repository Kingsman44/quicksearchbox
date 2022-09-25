package com.google.android.apps.gsa.publicsearch;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.publicsearch.ab */
/* compiled from: PG */
final class C84201ab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SystemParcelableWrapper(parcel.readParcelable((ClassLoader) null));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SystemParcelableWrapper[i];
    }
}
