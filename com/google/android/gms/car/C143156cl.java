package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.car.cl */
/* compiled from: PG */
public final class C143156cl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean z = false;
        Rect rect = null;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 2) {
                z2 = C143946b.m234077z(parcel, readInt);
            } else if (c == 3) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                rect = (Rect) C143946b.m234063l(parcel, readInt, Rect.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new InputFocusChangedEvent(z, z2, i, rect);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InputFocusChangedEvent[i];
    }
}
