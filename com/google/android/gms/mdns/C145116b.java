package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mdns.b */
/* compiled from: PG */
public final class C145116b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                arrayList = C143946b.m234072u(parcel, readInt);
            } else if (c == 3) {
                z = C143946b.m234077z(parcel, readInt);
            } else if (c == 4) {
                z2 = C143946b.m234077z(parcel, readInt);
            } else if (c == 5) {
                z3 = C143946b.m234077z(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                i = C143946b.m234057f(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MdnsSearchOptions(arrayList, z, z2, z3, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdnsSearchOptions[i];
    }
}
