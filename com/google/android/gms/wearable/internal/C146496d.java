package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.d */
/* compiled from: PG */
public final class C146496d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                b = C143946b.m234052a(parcel, readInt);
            } else if (c == 3) {
                b2 = C143946b.m234052a(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new AmsEntityUpdateParcelable(b, b2, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }
}
