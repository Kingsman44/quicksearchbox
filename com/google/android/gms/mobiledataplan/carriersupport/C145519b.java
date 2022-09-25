package com.google.android.gms.mobiledataplan.carriersupport;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.carriersupport.b */
/* compiled from: PG */
public final class C145519b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        CarrierSupportChannel[] carrierSupportChannelArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                carrierSupportChannelArr = (CarrierSupportChannel[]) C143946b.m234047D(parcel, readInt, CarrierSupportChannel.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new CarrierSupportInfo(str, str2, carrierSupportChannelArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CarrierSupportInfo[i];
    }
}
