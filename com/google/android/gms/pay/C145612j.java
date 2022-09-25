package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.j */
/* compiled from: PG */
public final class C145612j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PayGlobalActionCard[] payGlobalActionCardArr = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                payGlobalActionCardArr = (PayGlobalActionCard[]) C143946b.m234047D(parcel, readInt, PayGlobalActionCard.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetPayGlobalActionCardsResponse(payGlobalActionCardArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPayGlobalActionCardsResponse[i];
    }
}
