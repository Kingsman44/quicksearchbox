package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.appdatasearch.r */
/* compiled from: PG */
public final class C142821r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Status status = null;
        ArrayList arrayList = null;
        String[] strArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) C143946b.m234063l(parcel, readInt, Status.CREATOR);
            } else if (c == 2) {
                arrayList = C143946b.m234073v(parcel, readInt, UsageInfo.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                strArr = C143946b.m234048E(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetRecentContextCall$Response(status, arrayList, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetRecentContextCall$Response[i];
    }
}
