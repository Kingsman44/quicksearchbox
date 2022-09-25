package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.consent.c */
/* compiled from: PG */
public final class C145522c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConsentStatus(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentStatus[i];
    }
}
