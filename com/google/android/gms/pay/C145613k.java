package com.google.android.gms.pay;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.k */
/* compiled from: PG */
public final class C145613k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        byte[][] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr = C143946b.m234050G(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetSeFeatureReadinessStatusResponse(i, pendingIntent, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSeFeatureReadinessStatusResponse[i];
    }
}
