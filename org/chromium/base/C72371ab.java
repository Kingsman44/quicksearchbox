package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: org.chromium.base.ab */
/* compiled from: PG */
final class C72371ab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        if (readLong == 0 || readLong2 == 0) {
            return null;
        }
        return new UnguessableToken(readLong, readLong2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UnguessableToken[i];
    }
}
