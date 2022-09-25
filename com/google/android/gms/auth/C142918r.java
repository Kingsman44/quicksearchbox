package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.r */
/* compiled from: PG */
public final class C142918r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    l = C143946b.m234068q(parcel, readInt);
                    break;
                case 4:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 5:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                case 6:
                    arrayList = C143946b.m234072u(parcel, readInt);
                    break;
                case 7:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
