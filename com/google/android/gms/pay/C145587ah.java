package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.ah */
/* compiled from: PG */
public final class C145587ah implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String[] strArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                strArr = C143946b.m234048E(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SmartTapTransmissionData(strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SmartTapTransmissionData[i];
    }
}
