package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.o */
/* compiled from: PG */
public final class C145617o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean z = false;
        int[] iArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                iArr = C143946b.m234045B(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetWalletStatusResponse(z, iArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetWalletStatusResponse[i];
    }
}
