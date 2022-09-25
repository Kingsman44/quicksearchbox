package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.internal.bj */
/* compiled from: PG */
public final class C143921bj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                iBinder = C143946b.m234062k(parcel, readInt);
            } else if (c == 3) {
                connectionResult = (ConnectionResult) C143946b.m234063l(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c == 4) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z2 = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
