package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.text.internal.client.a */
/* compiled from: PG */
public final class C146326a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c == 4) {
                i3 = C143946b.m234057f(parcel, readInt);
            } else if (c == 5) {
                i4 = C143946b.m234057f(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                f = C143946b.m234054c(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new BoundingBoxParcel(i, i2, i3, i4, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BoundingBoxParcel[i];
    }
}
