package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.util.r */
/* compiled from: PG */
final class C91085r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return new CorrectionSpan(readString);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CorrectionSpan[i];
    }
}
