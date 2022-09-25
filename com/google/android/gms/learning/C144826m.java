package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.learning.m */
/* compiled from: PG */
public final class C144826m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 2) {
                z2 = C143946b.m234077z(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z3 = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new InAppTrainingConstraints(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InAppTrainingConstraints[i];
    }
}
