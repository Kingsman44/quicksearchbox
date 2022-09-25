package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.measurement.api.internal.l */
/* compiled from: PG */
public final class C145203l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 2:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 3:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 4:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    bundle = C143946b.m234061j(parcel2, readInt);
                    break;
                case 8:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new InitializationParams(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InitializationParams[i];
    }
}
