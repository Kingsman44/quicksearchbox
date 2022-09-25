package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* renamed from: com.google.android.gms.wallet.shared.b */
/* compiled from: PG */
public final class C146380b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        Account account = null;
        Bundle bundle = null;
        WalletCustomTheme walletCustomTheme = null;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 1;
        boolean z = false;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    account = (Account) C143946b.m234063l(parcel2, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = C143946b.m234061j(parcel2, readInt);
                    break;
                case 5:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 6:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 7:
                    walletCustomTheme = (WalletCustomTheme) C143946b.m234063l(parcel2, readInt, WalletCustomTheme.CREATOR);
                    break;
                case 8:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 9:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 10:
                    d2 = C143946b.m234053b(parcel2, readInt);
                    break;
                case 11:
                    i4 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 12:
                    i5 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new ApplicationParameters(i, account, bundle, z, i2, walletCustomTheme, i3, d, d2, i4, i5);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ApplicationParameters[i];
    }
}
