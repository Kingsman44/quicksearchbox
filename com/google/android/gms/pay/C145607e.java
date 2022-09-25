package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.e */
/* compiled from: PG */
public final class C145607e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bArr = C143946b.m234044A(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetClosedLoopBundleResponse(bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetClosedLoopBundleResponse[i];
    }
}
