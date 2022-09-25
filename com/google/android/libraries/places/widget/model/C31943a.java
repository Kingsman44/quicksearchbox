package com.google.android.libraries.places.widget.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.widget.model.a */
/* compiled from: PG */
final class C31943a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return AutocompleteActivityMode.valueOf(readString);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutocompleteActivityMode[i];
    }
}
