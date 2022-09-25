package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.am */
/* compiled from: PG */
public final class C143355am implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean z = false;
        String str = null;
        CredentialsData credentialsData = null;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 4) {
                z2 = C143946b.m234077z(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                credentialsData = (CredentialsData) C143946b.m234063l(parcel, readInt, CredentialsData.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LaunchOptions(z, str, z2, credentialsData);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LaunchOptions[i];
    }
}
