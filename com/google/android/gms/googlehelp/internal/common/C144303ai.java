package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.googlehelp.internal.common.ai */
/* compiled from: PG */
public final class C144303ai implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        int i = 0;
        String str = null;
        Intent intent = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = C143946b.m234057f(parcel, readInt);
            } else if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                intent = (Intent) C143946b.m234063l(parcel, readInt, Intent.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new OverflowMenuItem(i, str, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }
}
