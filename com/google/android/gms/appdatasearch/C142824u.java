package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.u */
/* compiled from: PG */
public final class C142824u implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    str5 = C143946b.m234069r(parcel, readInt);
                    break;
                case 8:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new GlobalSearchApplicationInfo(str, str2, i, i2, i3, str3, str4, str5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplicationInfo[i];
    }
}
