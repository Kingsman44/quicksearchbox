package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.people.protomodel.k */
/* compiled from: PG */
public final class C145698k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                num2 = C143946b.m234067p(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SourceStatsEntity(str, num, num2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SourceStatsEntity[i];
    }
}
