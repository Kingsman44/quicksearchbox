package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.internal.bl */
/* compiled from: PG */
public final class C143923bl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
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
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i3 = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
