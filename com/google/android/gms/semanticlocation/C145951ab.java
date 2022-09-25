package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.semanticlocation.ab */
/* compiled from: PG */
public final class C145951ab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        float f = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                f = C143946b.m234054c(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SemanticLocationEventRequest(f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocationEventRequest[i];
    }
}
