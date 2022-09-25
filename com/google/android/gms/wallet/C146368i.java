package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* renamed from: com.google.android.gms.wallet.i */
/* compiled from: PG */
public final class C146368i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        CommonWalletObject commonWalletObject = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                commonWalletObject = (CommonWalletObject) C143946b.m234063l(parcel, readInt, CommonWalletObject.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new OfferWalletObject(i, str, str2, commonWalletObject);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OfferWalletObject[i];
    }
}
