package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.global.j */
/* compiled from: PG */
public final class C145906j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        while (parcel.dataPosition() < h) {
            C143946b.m234076y(parcel, parcel.readInt());
        }
        C143946b.m234074w(parcel, h);
        return new GetPendingExperimentIdsCall$Request();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetPendingExperimentIdsCall$Request[i];
    }
}
