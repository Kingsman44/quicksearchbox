package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pseudonymous.g */
/* compiled from: PG */
public final class C145771g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PseudonymousIdToken(str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PseudonymousIdToken[i];
    }
}
