package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wearable.f */
/* compiled from: PG */
public final class C146411f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
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
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 6:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 7:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 8:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 10:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 13:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4, str5, i3, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
