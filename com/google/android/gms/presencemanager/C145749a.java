package com.google.android.gms.presencemanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.presencemanager.a */
/* compiled from: PG */
public final class C145749a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                C143946b.m234076y(parcel, readInt);
            } else {
                iBinder = C143946b.m234062k(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ActiveUser(iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActiveUser[i];
    }
}
