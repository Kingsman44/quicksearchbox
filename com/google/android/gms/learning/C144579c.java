package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.learning.c */
/* compiled from: PG */
public final class C144579c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                bArr = C143946b.m234044A(parcel, readInt);
            } else if (c == 3) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr2 = C143946b.m234044A(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ExampleConsumption(str, bArr, i, bArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExampleConsumption[i];
    }
}
