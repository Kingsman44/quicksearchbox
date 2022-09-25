package com.google.android.gms.usonia.directory.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.usonia.directory.internal.cb */
/* compiled from: PG */
public final class C146266cb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        IBinder iBinder = null;
        String str = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                iBinder = C143946b.m234062k(parcel, readInt);
            } else if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                iBinder2 = C143946b.m234062k(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new UnregisterDistributedServiceAvailabilityCallbackParams(iBinder, str, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UnregisterDistributedServiceAvailabilityCallbackParams[i];
    }
}
