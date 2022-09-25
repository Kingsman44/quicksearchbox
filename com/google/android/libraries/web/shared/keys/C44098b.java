package com.google.android.libraries.web.shared.keys;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.web.shared.keys.b */
/* compiled from: PG */
final class C44098b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelableCallbackKeyMultimap(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableCallbackKeyMultimap[i];
    }
}
