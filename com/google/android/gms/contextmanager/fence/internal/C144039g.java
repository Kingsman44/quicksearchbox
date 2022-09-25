package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.g */
/* compiled from: PG */
public final class C144039g implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        long j = 0;
        ContextFenceStub contextFenceStub = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                contextFenceStub = (ContextFenceStub) C143946b.m234063l(parcel, readInt, ContextFenceStub.CREATOR);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                j = C143946b.m234060i(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ContextFenceRegistrationStub(str, contextFenceStub, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ContextFenceRegistrationStub[i];
    }
}
