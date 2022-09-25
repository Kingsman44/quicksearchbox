package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.material.timepicker.r */
/* compiled from: PG */
final class C44994r implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeModel[i];
    }
}
