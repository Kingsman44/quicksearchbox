package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.car.at */
/* compiled from: PG */
public final class C143108at implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 2:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 8:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    str8 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 13:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 14:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 15:
                    z4 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 16:
                    str9 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 17:
                    str10 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new CarInfo(str, str2, str3, str4, i, i2, z, i3, str5, str6, str7, str8, z2, z3, z4, str9, str10);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarInfo[i];
    }
}
