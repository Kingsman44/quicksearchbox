package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.e */
/* compiled from: PG */
public final class C146505e implements Parcelable.Creator {
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
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    b = C143946b.m234052a(parcel2, readInt);
                    break;
                case 10:
                    b2 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 11:
                    b3 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 12:
                    b4 = C143946b.m234052a(parcel2, readInt);
                    break;
                case 13:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new AncsNotificationParcelable(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }
}
