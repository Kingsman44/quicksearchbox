package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.q */
/* compiled from: PG */
public final class C145619q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Account account = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                account = (Account) C143946b.m234063l(parcel, readInt, Account.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new Gp3SupportInfo(account);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Gp3SupportInfo[i];
    }
}
