package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.location.reporting.h */
/* compiled from: PG */
public final class C144970h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Integer num = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 4:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 5:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                case 7:
                    i3 = C143946b.m234057f(parcel, readInt);
                    break;
                case 8:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 9:
                    i4 = C143946b.m234057f(parcel, readInt);
                    break;
                case 10:
                    z3 = C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new ReportingState(i, i2, z, z2, i3, i4, num, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ReportingState[i];
    }
}
