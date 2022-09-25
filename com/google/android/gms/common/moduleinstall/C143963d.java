package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.moduleinstall.d */
/* compiled from: PG */
public final class C143963d implements Parcelable.Creator {
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
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallIntentResponse[i];
    }
}
