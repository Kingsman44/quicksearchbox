package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.semanticlocation.h */
/* compiled from: PG */
public final class C145961h implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C143946b.m234073v(parcel, readInt, InputSignals.CREATOR);
            } else if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                arrayList2 = C143946b.m234073v(parcel, readInt, SemanticSegment.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                z = C143946b.m234077z(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new DebugData(arrayList, i, arrayList2, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DebugData[i];
    }
}
