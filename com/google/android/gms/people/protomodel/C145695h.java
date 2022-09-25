package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.people.protomodel.h */
/* compiled from: PG */
public final class C145695h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 3;
        Boolean bool = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 3) {
                i = C143946b.m234067p(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bool = C143946b.m234064m(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PersonFieldMetadataEntity(i, bool);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonFieldMetadataEntity[i];
    }
}
