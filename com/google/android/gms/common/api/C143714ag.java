package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.api.ag */
/* compiled from: PG */
public final class C143714ag implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
            } else if (c == 4) {
                connectionResult = (ConnectionResult) C143946b.m234063l(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c != 1000) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
