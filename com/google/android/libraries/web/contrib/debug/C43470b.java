package com.google.android.libraries.web.contrib.debug;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.web.contrib.debug.b */
/* compiled from: PG */
final class C43470b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        C43474f fVar = (C43474f) Enum.valueOf(C43474f.class, parcel.readString());
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_DebugFeature(fVar, z, parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_DebugFeature[i];
    }
}
