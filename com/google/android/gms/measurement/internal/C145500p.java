package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* compiled from: PG */
public final class C145500p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = BuildConfig.FLAVOR;
        String str2 = str;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str10 = null;
        String str11 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 7:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 8:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 10:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 11:
                    j6 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 12:
                    str8 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 13:
                    j3 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 14:
                    j4 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 15:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 16:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 18:
                    z4 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 19:
                    str9 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 21:
                    bool = C143946b.m234064m(parcel2, readInt);
                    break;
                case 22:
                    j5 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 23:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                case 24:
                    str10 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 25:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 26:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 27:
                    str11 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new AppMetadata(str3, str4, str5, str6, j, j2, str7, z, z2, j6, str8, j3, j4, i, z3, z4, str9, bool, j5, arrayList, str10, str, str2, str11);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppMetadata[i];
    }
}
