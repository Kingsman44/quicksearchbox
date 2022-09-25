package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.social.populous.core.bc */
/* compiled from: PG */
final class C42277bc implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return (ClientId) ClientId.f110741a.get(parcel.readString());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientId[i];
    }
}
