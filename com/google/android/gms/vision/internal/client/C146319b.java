package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.internal.client.b */
/* compiled from: PG */
public final class C146319b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
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
                j = C143946b.m234060i(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i4 = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new FrameMetadataParcel(i, i2, i3, j, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FrameMetadataParcel[i];
    }
}
