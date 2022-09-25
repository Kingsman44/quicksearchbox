package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.material.datepicker.j */
/* compiled from: PG */
final class C44637j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DateValidatorPointForward(parcel.readLong());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DateValidatorPointForward[i];
    }
}
