package com.google.android.gms.pay;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.pay.aa */
/* compiled from: PG */
public final class C145580aa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PayCardArtInfo payCardArtInfo = null;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                payCardArtInfo = (PayCardArtInfo) C143946b.m234063l(parcel, readInt, PayCardArtInfo.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bitmap = (Bitmap) C143946b.m234063l(parcel, readInt, Bitmap.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PayCardArt(payCardArtInfo, bitmap);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PayCardArt[i];
    }
}
