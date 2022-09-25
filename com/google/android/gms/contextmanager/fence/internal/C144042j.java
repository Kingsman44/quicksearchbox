package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.j */
/* compiled from: PG */
public final class C144042j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = 0;
        String str = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                j = C143946b.m234060i(parcel, readInt);
            } else if (c == 4) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 5) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234073v(parcel, readInt, ContextData.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new FenceStateImpl(i, j, str, i2, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FenceStateImpl[i];
    }
}
