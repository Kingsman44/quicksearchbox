package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.v */
/* compiled from: PG */
public final class C146522v implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ChannelImpl channelImpl = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                channelImpl = (ChannelImpl) C143946b.m234063l(parcel, readInt, ChannelImpl.CREATOR);
            } else if (c == 3) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 4) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i3 = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ChannelEventParcelable(channelImpl, i, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelEventParcelable[i];
    }
}
