package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.learning.r */
/* compiled from: PG */
public final class C144831r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                j = C143946b.m234060i(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new TrainingInterval(i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TrainingInterval[i];
    }
}
