package com.google.android.libraries.gsa.util;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.gsa.util.d */
/* compiled from: PG */
final class C23339d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableBinder(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableBinder[i];
    }
}
