package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.d */
/* compiled from: PG */
final class C19672d implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Barcode.CalendarDateTime(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.CalendarDateTime[i];
    }
}
