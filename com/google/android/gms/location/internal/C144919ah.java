package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.location.internal.ah */
/* compiled from: PG */
public final class C144919ah implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    iBinder = C143946b.m234062k(parcel, readInt);
                    break;
                case 3:
                    iBinder2 = C143946b.m234062k(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) C143946b.m234063l(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new LocationReceiver(i, iBinder, iBinder2, pendingIntent, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationReceiver[i];
    }
}
