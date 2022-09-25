package com.google.android.gms.kids;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.kids.c */
/* compiled from: PG */
public final class C144431c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetParentVerificationIntentResponse(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetParentVerificationIntentResponse[i];
    }
}
