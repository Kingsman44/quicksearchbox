package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.mdh.MdhFootprint;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mdh.internal.s */
/* compiled from: PG */
public final class C145068s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234073v(parcel, readInt, MdhFootprint.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MdhFootprintListSafeParcelable(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdhFootprintListSafeParcelable[i];
    }
}
