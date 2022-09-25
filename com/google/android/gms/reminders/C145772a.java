package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.reminders.a */
/* compiled from: PG */
public final class C145772a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        boolean[] zArr = null;
        boolean[] zArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                zArr = C143946b.m234049F(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                zArr2 = C143946b.m234049F(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new AccountState(zArr, zArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountState[i];
    }
}
