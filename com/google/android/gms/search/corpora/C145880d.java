package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.search.corpora.d */
/* compiled from: PG */
public final class C145880d implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Status status = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                status = (Status) C143946b.m234063l(parcel, readInt, Status.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DeleteUsageReportCall$Response(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteUsageReportCall$Response[i];
    }
}
