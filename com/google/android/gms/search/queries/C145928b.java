package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.queries.b */
/* compiled from: PG */
public final class C145928b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        int[] iArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                iArr = C143946b.m234045B(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bundle = C143946b.m234061j(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new AnnotateCall$Request(str, str2, iArr, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AnnotateCall$Request[i];
    }
}
