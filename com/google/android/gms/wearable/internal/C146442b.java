package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.wearable.internal.b */
/* compiled from: PG */
public final class C146442b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                iBinder = C143946b.m234062k(parcel, readInt);
            } else if (c == 3) {
                intentFilterArr = (IntentFilter[]) C143946b.m234047D(parcel, readInt, IntentFilter.CREATOR);
            } else if (c == 4) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str2 = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new AddListenerRequest(iBinder, intentFilterArr, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AddListenerRequest[i];
    }
}
