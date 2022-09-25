package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.contextmanager.internal.y */
/* compiled from: PG */
public final class C144083y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234073v(parcel, readInt, KeyFilterImpl.Inclusion.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new KeyFilterImpl(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyFilterImpl[i];
    }
}
