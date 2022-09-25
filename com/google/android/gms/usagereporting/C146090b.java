package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.usagereporting.b */
/* compiled from: PG */
public final class C146090b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C143946b.m234073v(parcel, readInt, ConsentInformation.AccountConsentInformation.CREATOR);
            } else if (c == 2) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z2 = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ConsentInformation(arrayList, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConsentInformation[i];
    }
}
