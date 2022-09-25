package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.g */
/* compiled from: PG */
public final class C145609g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Account account = null;
        PassFilter passFilter = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                account = (Account) C143946b.m234063l(parcel, readInt, Account.CREATOR);
            } else if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                passFilter = (PassFilter) C143946b.m234063l(parcel, readInt, PassFilter.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetPassesRequest(account, i, i2, passFilter);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPassesRequest[i];
    }
}
