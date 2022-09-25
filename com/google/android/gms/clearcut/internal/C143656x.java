package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.clearcut.internal.x */
/* compiled from: PG */
public final class C143656x implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 8:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 10:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 11:
                    num = C143946b.m234067p(parcel2, readInt);
                    break;
                case 12:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 13:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new PlayLoggerContext(str, i, i2, str2, z, str3, z2, i3, num, z3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
