package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.ao */
/* compiled from: PG */
public final class C142799ao implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new Section(str, z, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Section[i];
    }
}
