package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.contextmanager.internal.a */
/* compiled from: PG */
public final class C144054a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        QueryFilterParameters queryFilterParameters = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                arrayList = C143946b.m234073v(parcel, readInt, ContextDataFilterImpl.Inclusion.CREATOR);
            } else if (c == 3) {
                arrayList2 = C143946b.m234072u(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                queryFilterParameters = (QueryFilterParameters) C143946b.m234063l(parcel, readInt, QueryFilterParameters.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ContextDataFilterImpl(arrayList, arrayList2, queryFilterParameters);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContextDataFilterImpl[i];
    }
}
