package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.b */
/* compiled from: PG */
public final class C143369b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String[] strArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 6:
                    strArr = C143946b.m234048E(parcel2, readInt);
                    break;
                case 7:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 8:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new AdBreakInfo(j, str, j2, z, strArr, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdBreakInfo[i];
    }
}
