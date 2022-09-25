package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.barhopper.a */
/* compiled from: PG */
final class C19669a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Barcode(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode[i];
    }
}
