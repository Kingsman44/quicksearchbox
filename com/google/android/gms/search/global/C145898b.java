package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.global.b */
/* compiled from: PG */
public final class C145898b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        while (parcel.dataPosition() < h) {
            C143946b.m234076y(parcel, parcel.readInt());
        }
        C143946b.m234074w(parcel, h);
        return new GetCurrentExperimentIdsCall$Request();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCurrentExperimentIdsCall$Request[i];
    }
}
