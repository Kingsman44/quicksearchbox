package com.google.android.libraries.gsa.monet.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.s */
/* compiled from: PG */
final class C23023s implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FeatureSubtreeSnapshotImpl((HierarchyState) parcel.readParcelable(getClass().getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FeatureSubtreeSnapshotImpl[i];
    }
}
