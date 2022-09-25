package com.google.android.apps.gsa.opaonboarding;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.opaonboarding.aj */
/* compiled from: PG */
final class C83876aj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        int readInt2 = parcel.readInt();
        C83877ak d = HotwordTrainingConfig.m133502d();
        d.mo77218b(readInt);
        d.mo77220d(z);
        d.mo77219c(readInt2);
        return d.mo77217a();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HotwordTrainingConfig[i];
    }
}
