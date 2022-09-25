package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.people.protomodel.c */
/* compiled from: PG */
public final class C145690c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Integer num = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                num = C143946b.m234067p(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DeviceVersionEntity(num);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceVersionEntity[i];
    }
}
