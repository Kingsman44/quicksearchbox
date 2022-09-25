package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.search.shared.service.f */
/* compiled from: PG */
final class C88485f implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        amo a = amo.m92435a(parcel.readInt());
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        readString.getClass();
        return new ClientConfig((BitFlags) parcel.readParcelable(BitFlags.class.getClassLoader()), (BitFlags) parcel.readParcelable(BitFlags.class.getClassLoader()), a, readInt, readString, parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientConfig[i];
    }
}
