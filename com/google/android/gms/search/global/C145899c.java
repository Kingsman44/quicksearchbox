package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.global.c */
/* compiled from: PG */
public final class C145899c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Status status = null;
        int[] iArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C143946b.m234063l(parcel, readInt, Status.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                iArr = C143946b.m234045B(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetCurrentExperimentIdsCall$Response(status, iArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCurrentExperimentIdsCall$Response[i];
    }
}
