package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.semanticlocation.w */
/* compiled from: PG */
public final class C145985w implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = C143946b.m234073v(parcel, readInt, RtslCellInfo.CREATOR);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList2 = C143946b.m234071t(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new RtslDebugData(arrayList, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RtslDebugData[i];
    }
}
