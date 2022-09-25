package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.i */
/* compiled from: PG */
public final class C145611i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PayCardArt[] payCardArtArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                payCardArtArr = (PayCardArt[]) C143946b.m234047D(parcel, readInt, PayCardArt.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetPayCardArtResponse(payCardArtArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPayCardArtResponse[i];
    }
}
