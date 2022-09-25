package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.m */
/* compiled from: PG */
public final class C145615m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Transaction[] transactionArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                transactionArr = (Transaction[]) C143946b.m234047D(parcel, readInt, Transaction.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetTransactionsResponse(transactionArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetTransactionsResponse[i];
    }
}
