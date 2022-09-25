package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.firstparty.d */
/* compiled from: PG */
public final class C146356d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        WalletCustomTheme walletCustomTheme = null;
        boolean z = false;
        int i = 1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                walletCustomTheme = (WalletCustomTheme) C143946b.m234063l(parcel, readInt, WalletCustomTheme.CREATOR);
            } else if (c == 3) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetClientTokenRequest(walletCustomTheme, z, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetClientTokenRequest[i];
    }
}
