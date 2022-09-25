package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.presencemanager.d */
/* compiled from: PG */
public final class C145760d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 2:
                    j = C143946b.m234060i(parcel, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new PresentUser(str, j, i, i2, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PresentUser[i];
    }
}
