package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.appdatasearch.i */
/* compiled from: PG */
public final class C142812i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        DocumentSection[] documentSectionArr = null;
        String str = null;
        Account account = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                documentSectionArr = (DocumentSection[]) C143946b.m234047D(parcel, readInt, DocumentSection.CREATOR);
            } else if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                account = (Account) C143946b.m234063l(parcel, readInt, Account.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DocumentContents(documentSectionArr, str, z, account);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DocumentContents[i];
    }
}
