package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.contextmanager.internal.o */
/* compiled from: PG */
public final class C144073o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
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
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 5:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 11:
                    i5 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 12:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new ContextManagerClientInfo(str, str2, i, str3, i2, i3, str4, str5, i4, i5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContextManagerClientInfo[i];
    }
}
