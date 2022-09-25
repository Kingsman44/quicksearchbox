package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.semanticlocation.ac */
/* compiled from: PG */
public final class C145952ac implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        long j = 0;
        DebugData debugData = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C143946b.m234073v(parcel, readInt, SemanticLocationEvent.CREATOR);
            } else if (c == 2) {
                j = C143946b.m234060i(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                debugData = (DebugData) C143946b.m234063l(parcel, readInt, DebugData.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SemanticLocationState(arrayList, j, debugData);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocationState[i];
    }
}
