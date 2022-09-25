package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.gms.awareness.snapshot.internal.e */
/* compiled from: PG */
public final class C142942e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        double d = C59203do.f157270a;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                d = C143946b.m234053b(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new PowerStateImpl(i, d);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PowerStateImpl[i];
    }
}
