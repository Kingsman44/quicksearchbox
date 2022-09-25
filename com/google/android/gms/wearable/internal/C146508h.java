package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.wearable.internal.h */
/* compiled from: PG */
public final class C146508h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234072u(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new AppWearDetailsParcelable(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppWearDetailsParcelable[i];
    }
}
