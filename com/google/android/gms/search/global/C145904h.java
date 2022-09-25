package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.global.h */
/* compiled from: PG */
public final class C145904h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Status status = null;
        GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C143946b.m234063l(parcel, readInt, Status.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                getGlobalSearchSourcesCall$GlobalSearchSourceArr = (GetGlobalSearchSourcesCall$GlobalSearchSource[]) C143946b.m234047D(parcel, readInt, GetGlobalSearchSourcesCall$GlobalSearchSource.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetGlobalSearchSourcesCall$Response(status, getGlobalSearchSourcesCall$GlobalSearchSourceArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$Response[i];
    }
}
