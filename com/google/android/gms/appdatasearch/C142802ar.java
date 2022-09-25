package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.ar */
/* compiled from: PG */
public final class C142802ar implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                strArr = C143946b.m234048E(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                strArr2 = C143946b.m234048E(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SuggestionResults(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SuggestionResults[i];
    }
}
