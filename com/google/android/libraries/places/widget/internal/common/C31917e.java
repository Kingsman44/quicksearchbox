package com.google.android.libraries.places.widget.internal.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.widget.internal.common.e */
/* compiled from: PG */
final class C31917e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return AutocompleteActivityOrigin.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutocompleteActivityOrigin[i];
    }
}
