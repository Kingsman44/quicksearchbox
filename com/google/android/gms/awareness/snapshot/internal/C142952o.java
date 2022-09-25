package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.awareness.snapshot.internal.o */
/* compiled from: PG */
public final class C142952o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int[] iArr = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c == 3) {
                f2 = C143946b.m234054c(parcel, readInt);
            } else if (c == 4) {
                f3 = C143946b.m234054c(parcel, readInt);
            } else if (c == 5) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                iArr = C143946b.m234045B(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new WeatherImpl(f, f2, f3, i, iArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WeatherImpl[i];
    }
}
