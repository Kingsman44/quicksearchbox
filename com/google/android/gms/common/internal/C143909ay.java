package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.common.internal.ay */
/* compiled from: PG */
public final class C143909ay implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 2:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 6:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    i5 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
