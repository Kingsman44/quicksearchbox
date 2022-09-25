package com.google.android.libraries.gsa.monet.shared;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.gsa.monet.shared.r */
/* compiled from: PG */
final class C23122r implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LazyParcelable(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LazyParcelable[i];
    }
}
