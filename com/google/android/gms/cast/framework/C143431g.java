package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.cast.framework.g */
/* compiled from: PG */
public final class C143431g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        ArrayList arrayList = null;
        LaunchOptions launchOptions = null;
        CastMediaOptions castMediaOptions = null;
        ArrayList arrayList2 = null;
        double d = 0.0d;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                case 4:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 5:
                    launchOptions = (LaunchOptions) C143946b.m234063l(parcel2, readInt, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) C143946b.m234063l(parcel2, readInt, CastMediaOptions.CREATOR);
                    break;
                case 8:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 9:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 10:
                    z4 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 11:
                    z5 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 12:
                    z6 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 13:
                    arrayList2 = C143946b.m234072u(parcel2, readInt);
                    break;
                case 14:
                    z7 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 15:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new CastOptions(str, arrayList, z, launchOptions, z2, castMediaOptions, z3, d, z4, z5, z6, arrayList2, z7, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CastOptions[i];
    }
}
