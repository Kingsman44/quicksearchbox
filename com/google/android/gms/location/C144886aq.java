package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.libs.identity.ClientIdentity;

/* renamed from: com.google.android.gms.location.aq */
/* compiled from: PG */
public final class C144886aq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = Long.MAX_VALUE;
        String str = null;
        ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = C143946b.m234060i(parcel, readInt);
            } else if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 4) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                clientIdentity = (ClientIdentity) C143946b.m234063l(parcel, readInt, ClientIdentity.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LastLocationRequest(j, i, z, str, clientIdentity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
