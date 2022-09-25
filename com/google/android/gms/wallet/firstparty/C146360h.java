package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.firstparty.h */
/* compiled from: PG */
public final class C146360h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Bundle bundle = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                bundle = C143946b.m234061j(parcel, readInt);
            } else if (c == 4) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 5) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i3 = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new WalletCustomTheme(i, bundle, str, i2, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletCustomTheme[i];
    }
}
