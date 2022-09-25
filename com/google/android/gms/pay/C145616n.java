package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.n */
/* compiled from: PG */
public final class C145616n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        TransitCard[] transitCardArr = null;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                transitCardArr = (TransitCard[]) C143946b.m234047D(parcel, readInt, TransitCard.CREATOR);
            } else if (c == 2) {
                bitmap = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bitmap2 = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetTransitCardsResponse(transitCardArr, bitmap, bitmap2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetTransitCardsResponse[i];
    }
}
