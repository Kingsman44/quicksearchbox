package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.aa */
/* compiled from: PG */
public final class C146416aa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 3) {
                z2 = C143946b.m234077z(parcel, readInt);
            } else if (c == 4) {
                z3 = C143946b.m234077z(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z4 = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConsentResponse(i, z, z2, z3, z4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentResponse[i];
    }
}
