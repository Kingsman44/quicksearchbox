package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.material.datepicker.aq */
/* compiled from: PG */
final class C44621aq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        SingleDateSelector singleDateSelector = new SingleDateSelector();
        singleDateSelector.f116205a = (Long) parcel.readValue(Long.class.getClassLoader());
        return singleDateSelector;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SingleDateSelector[i];
    }
}
