package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.ae */
/* compiled from: PG */
public final class C142789ae implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String[] strArr = null;
        String str = null;
        String str2 = null;
        String[] strArr2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                strArr = C143946b.m234048E(parcel, readInt);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 4) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c == 6) {
                str3 = C143946b.m234069r(parcel, readInt);
            } else if (c != 7) {
                C143946b.m234076y(parcel, readInt);
            } else {
                strArr2 = C143946b.m234048E(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RegisterCorpusIMEInfo(i, strArr, str, str2, strArr2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusIMEInfo[i];
    }
}
