package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.k */
/* compiled from: PG */
public final class C142814k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                bundle = C143946b.m234061j(parcel, readInt);
            } else if (c == 3) {
                bundle2 = C143946b.m234061j(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bundle3 = C143946b.m234061j(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DocumentResults(str, bundle, bundle2, bundle3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DocumentResults[i];
    }
}
