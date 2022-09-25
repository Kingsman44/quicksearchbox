package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.wobs.g */
/* compiled from: PG */
public final class C146391g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = C143946b.m234060i(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                j2 = C143946b.m234060i(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new TimeInterval(j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeInterval[i];
    }
}
