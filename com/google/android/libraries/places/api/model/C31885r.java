package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.api.model.r */
/* compiled from: PG */
final class C31885r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        String readString = parcel.readInt() == 0 ? parcel.readString() : null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        }
        return new AutoValue_PlusCode(readString, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_PlusCode[i];
    }
}
