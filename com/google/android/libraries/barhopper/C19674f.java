package com.google.android.libraries.barhopper;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* renamed from: com.google.android.libraries.barhopper.f */
/* compiled from: PG */
final class C19674f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Barcode.ContactInfo(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Barcode.ContactInfo[i];
    }
}
