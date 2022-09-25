package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.location.internal.ak */
/* compiled from: PG */
public final class C144922ak implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 2:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    C143946b.m234075x(parcel2, readInt, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 5:
                    d2 = C143946b.m234053b(parcel2, readInt);
                    break;
                case 6:
                    f = C143946b.m234054c(parcel2, readInt);
                    break;
                case 7:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new ParcelableGeofence(str, i, s, d, d2, f, j, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableGeofence[i];
    }
}
