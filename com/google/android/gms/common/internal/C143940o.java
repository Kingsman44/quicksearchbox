package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.o */
/* compiled from: PG */
final class C143940o implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
