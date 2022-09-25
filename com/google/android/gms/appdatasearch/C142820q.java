package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.q */
/* compiled from: PG */
public final class C142820q implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Account account = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                account = (Account) C143946b.m234063l(parcel, readInt, Account.CREATOR);
            } else if (c == 2) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 3) {
                z2 = C143946b.m234077z(parcel, readInt);
            } else if (c == 4) {
                z3 = C143946b.m234077z(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetRecentContextCall$Request(account, z, z2, z3, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetRecentContextCall$Request[i];
    }
}
