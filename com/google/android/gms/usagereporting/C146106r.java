package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.usagereporting.r */
/* compiled from: PG */
public final class C146106r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        String str = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    z = C143946b.m234077z(parcel, readInt);
                    break;
                case 4:
                    arrayList = C143946b.m234072u(parcel, readInt);
                    break;
                case 5:
                    i2 = C143946b.m234057f(parcel, readInt);
                    break;
                case 6:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    z2 = C143946b.m234077z(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new UsageReportingOptInOptions(i, z, arrayList, i2, str, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UsageReportingOptInOptions[i];
    }
}
