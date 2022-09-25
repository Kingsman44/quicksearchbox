package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.i */
/* compiled from: PG */
public final class C144041i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        FenceQueryRequestImpl.QueryFenceOperation queryFenceOperation = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                queryFenceOperation = (FenceQueryRequestImpl.QueryFenceOperation) C143946b.m234063l(parcel, readInt, FenceQueryRequestImpl.QueryFenceOperation.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new FenceQueryRequestImpl(queryFenceOperation);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FenceQueryRequestImpl[i];
    }
}
