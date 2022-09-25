package com.google.android.gms.kids.parentaccess;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.kids.parentaccess.a */
/* compiled from: PG */
public final class C144433a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                j = C143946b.m234060i(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ParentAccessToken(str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParentAccessToken[i];
    }
}
