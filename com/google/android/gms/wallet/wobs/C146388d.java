package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.wobs.d */
/* compiled from: PG */
public final class C146388d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        double d = 0.0d;
        long j = 0;
        int i = 0;
        int i2 = -1;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    d = C143946b.m234053b(parcel2, readInt);
                    break;
                case 5:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 6:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 7:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new LoyaltyPointsBalance(i, str, d, str2, j, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
