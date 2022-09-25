package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j;

import android.graphics.Path;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.e */
/* compiled from: PG */
final class C81812e extends C81814g {

    /* renamed from: a */
    private final Path f223745a;

    public C81812e(Path path) {
        this.f223745a = path;
    }

    /* renamed from: a */
    public final int mo75343a() {
        return 2;
    }

    /* renamed from: b */
    public final Path mo75347b() {
        return this.f223745a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C81820m) {
            C81820m mVar = (C81820m) obj;
            if (mVar.mo75343a() != 2 || !this.f223745a.equals(mVar.mo75347b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f223745a.hashCode();
    }

    public final String toString() {
        String obj = this.f223745a.toString();
        return "TouchConfig{region=" + obj + "}";
    }
}
