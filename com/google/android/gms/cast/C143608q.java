package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.q */
/* compiled from: PG */
public final class C143608q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                f = C143946b.m234054c(parcel, readInt);
            } else if (c == 3) {
                f2 = C143946b.m234054c(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                f3 = C143946b.m234054c(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new EqualizerBandSettings(f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EqualizerBandSettings[i];
    }
}
