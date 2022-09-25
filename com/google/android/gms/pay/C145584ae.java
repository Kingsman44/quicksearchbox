package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.ae */
/* compiled from: PG */
public final class C145584ae implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        GooglePaymentMethodId googlePaymentMethodId = null;
        SePrepaidCardId sePrepaidCardId = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                googlePaymentMethodId = (GooglePaymentMethodId) C143946b.m234063l(parcel, readInt, GooglePaymentMethodId.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                sePrepaidCardId = (SePrepaidCardId) C143946b.m234063l(parcel, readInt, SePrepaidCardId.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SeCardLoadingStateData(i, googlePaymentMethodId, sePrepaidCardId);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SeCardLoadingStateData[i];
    }
}
