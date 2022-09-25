package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.cj */
/* compiled from: PG */
public final class C146479cj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                iBinder = C143946b.m234062k(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RemoveListenerRequest(i, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoveListenerRequest[i];
    }
}
