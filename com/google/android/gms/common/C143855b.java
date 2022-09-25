package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.b */
/* compiled from: PG */
public final class C143855b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
