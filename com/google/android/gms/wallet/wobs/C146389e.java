package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.wobs.e */
/* compiled from: PG */
public final class C146389e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) C143946b.m234063l(parcel, readInt, LoyaltyPointsBalance.CREATOR);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                timeInterval = (TimeInterval) C143946b.m234063l(parcel, readInt, TimeInterval.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
