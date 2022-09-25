package com.google.android.apps.gsa.shared.search;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.apps.gsa.shared.search.m */
/* compiled from: PG */
final class C90505m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return (QueryTriggerType) QueryTriggerType.f252812Y.get(parcel.readInt(), QueryTriggerType.USER);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new QueryTriggerType[i];
    }
}
