package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.aq */
/* compiled from: PG */
public final class C143359aq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = C143946b.m234060i(parcel, readInt);
            } else if (c == 3) {
                j2 = C143946b.m234060i(parcel, readInt);
            } else if (c == 4) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z2 = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MediaLiveSeekableRange(j, j2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaLiveSeekableRange[i];
    }
}
