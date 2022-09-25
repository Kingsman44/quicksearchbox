package com.google.android.gms.mobiledataplan;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.n */
/* compiled from: PG */
public final class C145539n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Bundle bundle = null;
        Integer num = null;
        Long l = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                bundle = C143946b.m234061j(parcel, readInt);
            } else if (c == 3) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                l = C143946b.m234068q(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MdpCarrierPlanIdRequest(str, bundle, num, l);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpCarrierPlanIdRequest[i];
    }
}
