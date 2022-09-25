package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.googlehelp.j */
/* compiled from: PG */
public final class C144332j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        GoogleHelp googleHelp = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    googleHelp = (GoogleHelp) C143946b.m234063l(parcel, readInt, GoogleHelp.CREATOR);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new InProductHelp(googleHelp, str, str2, i, str3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InProductHelp[i];
    }
}
