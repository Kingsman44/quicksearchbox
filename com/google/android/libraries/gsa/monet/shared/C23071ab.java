package com.google.android.libraries.gsa.monet.shared;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.gsa.monet.shared.ab */
/* compiled from: PG */
final class C23071ab implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ProtoParcelable(parcel.createByteArray());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProtoParcelable[i];
    }
}
