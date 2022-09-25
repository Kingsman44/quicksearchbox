package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;

/* renamed from: com.google.android.gms.contextmanager.internal.b */
/* compiled from: PG */
public final class C144060b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        TimeFilterImpl timeFilterImpl = null;
        KeyFilterImpl keyFilterImpl = null;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                i2 = C143946b.m234057f(parcel, readInt);
            } else if (c == 4) {
                timeFilterImpl = (TimeFilterImpl) C143946b.m234063l(parcel, readInt, TimeFilterImpl.CREATOR);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                keyFilterImpl = (KeyFilterImpl) C143946b.m234063l(parcel, readInt, KeyFilterImpl.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ContextDataFilterImpl.Inclusion(i, i2, timeFilterImpl, keyFilterImpl);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContextDataFilterImpl.Inclusion[i];
    }
}
