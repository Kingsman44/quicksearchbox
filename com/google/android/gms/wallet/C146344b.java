package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: com.google.android.gms.wallet.b */
/* compiled from: PG */
public final class C146344b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        UserAddress userAddress = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                str3 = C143946b.m234069r(parcel, readInt);
            } else if (c == 4) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                userAddress = (UserAddress) C143946b.m234063l(parcel, readInt, UserAddress.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new CardInfo(str, str2, str3, i, userAddress);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }
}
