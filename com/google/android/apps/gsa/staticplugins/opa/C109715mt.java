package com.google.android.apps.gsa.staticplugins.opa;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.mt */
/* compiled from: PG */
final class C109715mt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OpaResultCallback(parcel.readInt(), parcel.readBundle());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OpaResultCallback[i];
    }
}
