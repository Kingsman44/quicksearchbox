package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.material.datepicker.ah */
/* compiled from: PG */
final class C44612ah implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return Month.m79035e(parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Month[i];
    }
}
