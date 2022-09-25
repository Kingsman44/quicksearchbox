package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;

/* renamed from: com.google.android.gms.contextmanager.internal.z */
/* compiled from: PG */
public final class C144084z implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                strArr = C143946b.m234048E(parcel, readInt);
            } else if (c == 3) {
                strArr2 = C143946b.m234048E(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                strArr3 = C143946b.m234048E(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new KeyFilterImpl.Inclusion(strArr, strArr2, strArr3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new KeyFilterImpl.Inclusion[i];
    }
}
