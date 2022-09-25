package com.google.android.gms.vision.text.internal.client;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.vision.text.internal.client.e */
/* compiled from: PG */
public final class C146330e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Rect rect = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                rect = (Rect) C143946b.m234063l(parcel, readInt, Rect.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RecognitionOptions(rect);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecognitionOptions[i];
    }
}
