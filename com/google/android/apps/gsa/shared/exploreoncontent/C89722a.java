package com.google.android.apps.gsa.shared.exploreoncontent;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.exploreoncontent.a */
/* compiled from: PG */
final class C89722a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ExplorePivotItem(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExplorePivotItem[i];
    }
}
