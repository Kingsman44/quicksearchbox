package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.m */
/* compiled from: PG */
public final class C143604m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        byte[] bArr = null;
        String str9 = null;
        CastEurekaInfo castEurekaInfo = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    arrayList = C143946b.m234073v(parcel2, readInt, WebImage.CREATOR);
                    break;
                case 9:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 10:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 11:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 13:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 14:
                    str8 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 15:
                    bArr = C143946b.m234044A(parcel2, readInt);
                    break;
                case 16:
                    str9 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 17:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 18:
                    castEurekaInfo = (CastEurekaInfo) C143946b.m234063l(parcel2, readInt, CastEurekaInfo.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new CastDevice(str, str2, str3, str4, str5, i, arrayList, i2, i3, str6, str7, i4, str8, bArr, str9, z, castEurekaInfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CastDevice[i];
    }
}
