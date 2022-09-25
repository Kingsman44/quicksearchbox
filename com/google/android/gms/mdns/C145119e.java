package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mdns.e */
/* compiled from: PG */
public final class C145119e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String[] strArr = null;
        ArrayList arrayList = null;
        String[] strArr2 = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    strArr = C143946b.m234048E(parcel2, readInt);
                    break;
                case 4:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                case 5:
                    strArr2 = C143946b.m234048E(parcel2, readInt);
                    break;
                case 6:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 8:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    arrayList2 = C143946b.m234072u(parcel2, readInt);
                    break;
                case 10:
                    arrayList3 = C143946b.m234073v(parcel2, readInt, MdnsServiceInfo.TextEntry.CREATOR);
                    break;
                case 11:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MdnsServiceInfo(str, strArr, arrayList, strArr2, i, str2, str3, arrayList2, arrayList3, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdnsServiceInfo[i];
    }
}
