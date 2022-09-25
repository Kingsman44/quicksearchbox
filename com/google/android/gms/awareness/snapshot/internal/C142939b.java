package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.awareness.snapshot.internal.b */
/* compiled from: PG */
public final class C142939b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234073v(parcel, readInt, BeaconStateImpl.BeaconInfoImpl.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new BeaconStateImpl(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BeaconStateImpl[i];
    }
}
