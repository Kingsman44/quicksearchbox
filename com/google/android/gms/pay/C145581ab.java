package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.ab */
/* compiled from: PG */
public final class C145581ab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PayCardArtInfo(i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PayCardArtInfo[i];
    }
}
