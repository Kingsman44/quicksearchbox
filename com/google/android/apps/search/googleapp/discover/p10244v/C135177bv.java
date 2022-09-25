package com.google.android.apps.search.googleapp.discover.p10244v;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.bv */
/* compiled from: PG */
public final class C135177bv {

    /* renamed from: a */
    public final List f368200a;

    /* renamed from: b */
    public final List f368201b;

    public C135177bv(List list, List list2) {
        this.f368200a = list;
        this.f368201b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135177bv)) {
            return false;
        }
        C135177bv bvVar = (C135177bv) obj;
        return C69664n.m101066l(this.f368200a, bvVar.f368200a) && C69664n.m101066l(this.f368201b, bvVar.f368201b);
    }

    public final int hashCode() {
        return (this.f368200a.hashCode() * 31) + this.f368201b.hashCode();
    }

    public final String toString() {
        List list = this.f368200a;
        List list2 = this.f368201b;
        return "StructureAndContent(structure=" + list + ", content=" + list2 + ")";
    }
}
