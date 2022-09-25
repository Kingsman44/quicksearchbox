package com.google.android.libraries.gsa.monet.internal.shared;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.a */
/* compiled from: PG */
final class C23031a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BoundedParcelable(parcel.readByte() == 1 ? parcel.readParcelable(BoundedParcelable.class.getClassLoader()) : null, parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BoundedParcelable[i];
    }
}
