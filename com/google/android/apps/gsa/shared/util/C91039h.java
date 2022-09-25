package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.util.h */
/* compiled from: PG */
final class C91039h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        String readString = parcel.readString();
        if (readString != null) {
            try {
                return new BitFlags(Class.forName(readString), "FLAG_", readLong);
            } catch (ClassNotFoundException unused) {
            }
        }
        return new BitFlags((Class) null, "FLAG_", readLong);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BitFlags[i];
    }
}
