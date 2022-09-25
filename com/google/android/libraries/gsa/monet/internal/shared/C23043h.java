package com.google.android.libraries.gsa.monet.internal.shared;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.gsa.monet.internal.shared.h */
/* compiled from: PG */
final class C23043h implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FeatureStateSnapshot(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FeatureStateSnapshot[i];
    }
}
