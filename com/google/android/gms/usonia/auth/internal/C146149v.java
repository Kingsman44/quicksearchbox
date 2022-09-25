package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.usonia.auth.internal.v */
/* compiled from: PG */
public final class C146149v implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        TrustedId[] trustedIdArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                trustedIdArr = (TrustedId[]) C143946b.m234047D(parcel, readInt, TrustedId.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new OnStructureInfoUpdatedParams(trustedIdArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OnStructureInfoUpdatedParams[i];
    }
}
