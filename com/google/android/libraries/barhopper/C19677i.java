package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.i */
/* compiled from: PG */
final class C19677i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Barcode.FlightSegment(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.FlightSegment[i];
    }
}
