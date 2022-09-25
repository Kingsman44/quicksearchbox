package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wallet.wobs.i */
/* compiled from: PG */
public final class C146393i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c == 4) {
                timeInterval = (TimeInterval) C143946b.m234063l(parcel, readInt, TimeInterval.CREATOR);
            } else if (c == 5) {
                uriData = (UriData) C143946b.m234063l(parcel, readInt, UriData.CREATOR);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                uriData2 = (UriData) C143946b.m234063l(parcel, readInt, UriData.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
