package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.l */
/* compiled from: PG */
public final class C145614l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        SortOrderInfo sortOrderInfo = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                sortOrderInfo = (SortOrderInfo) C143946b.m234063l(parcel, readInt, SortOrderInfo.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetSortOrderResponse(sortOrderInfo);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSortOrderResponse[i];
    }
}
