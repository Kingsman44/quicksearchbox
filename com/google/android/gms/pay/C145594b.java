package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.b */
/* compiled from: PG */
public final class C145594b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        DataChangeListenerType dataChangeListenerType = null;
        SmartTapTransmissionData smartTapTransmissionData = null;
        SeCardLoadingStateData seCardLoadingStateData = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataChangeListenerType = (DataChangeListenerType) C143946b.m234063l(parcel, readInt, DataChangeListenerType.CREATOR);
            } else if (c == 2) {
                smartTapTransmissionData = (SmartTapTransmissionData) C143946b.m234063l(parcel, readInt, SmartTapTransmissionData.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                seCardLoadingStateData = (SeCardLoadingStateData) C143946b.m234063l(parcel, readInt, SeCardLoadingStateData.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DataChangeListenerResponse(dataChangeListenerType, smartTapTransmissionData, seCardLoadingStateData);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataChangeListenerResponse[i];
    }
}
