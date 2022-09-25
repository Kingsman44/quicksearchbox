package com.google.android.libraries.gsa.monet.internal.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.FeatureSubtreeSnapshot;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;

/* compiled from: PG */
public final class FeatureSubtreeSnapshotImpl implements FeatureSubtreeSnapshot {
    public static final Parcelable.Creator CREATOR = new C23023s();

    /* renamed from: a */
    private final HierarchyState f63271a;

    public FeatureSubtreeSnapshotImpl(HierarchyState hierarchyState) {
        this.f63271a = hierarchyState;
    }

    /* renamed from: a */
    public final void mo28402a(C23052c cVar, String str) {
        C23015k kVar = (C23015k) cVar;
        C23088b bVar = this.f63271a.f63364a;
        FeatureStateSnapshot featureStateSnapshot = (FeatureStateSnapshot) bVar.get(0);
        kVar.mo28428r(str, new C23129y(featureStateSnapshot.mo28454a().f63377c), C23025u.m43148a(featureStateSnapshot, C23025u.m43149b(bVar)), kVar.f63317l);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f63271a, i);
    }
}
