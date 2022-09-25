package com.google.android.gms.mobiledataplan.consent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.mobiledataplan.consent.e */
/* compiled from: PG */
public final class C145524e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Integer num = null;
        Long l = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 2) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 3) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c == 4) {
                l = C143946b.m234068q(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                bundle = C143946b.m234061j(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new GetConsentInformationRequest(str, z, num, l, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetConsentInformationRequest[i];
    }
}
