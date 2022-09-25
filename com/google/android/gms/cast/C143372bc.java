package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.cast.bc */
/* compiled from: PG */
public final class C143372bc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        MediaLoadRequestData mediaLoadRequestData = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                mediaLoadRequestData = (MediaLoadRequestData) C143946b.m234063l(parcel, readInt, MediaLoadRequestData.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new SessionState(mediaLoadRequestData, C143596v.m233275h(str));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SessionState[i];
    }
}
