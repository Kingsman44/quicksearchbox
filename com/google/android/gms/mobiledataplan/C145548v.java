package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mobiledataplan.v */
/* compiled from: PG */
public final class C145548v implements Parcelable.Creator {
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
        ArrayList arrayList = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
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
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 8:
                    j3 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 9:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 12:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MdpUpsellPlan(str, str2, str3, j, str4, str5, j2, j3, str6, str7, i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpUpsellPlan[i];
    }
}
