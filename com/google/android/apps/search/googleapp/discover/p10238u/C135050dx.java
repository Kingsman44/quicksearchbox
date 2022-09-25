package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.dx */
/* compiled from: PG */
public final class C135050dx {

    /* renamed from: a */
    public final C57259bn f367772a;

    /* renamed from: b */
    public final C57252bg f367773b;

    /* renamed from: c */
    public final String f367774c;

    /* renamed from: d */
    public final C134991bw f367775d;

    /* renamed from: e */
    public final C135034dh f367776e;

    /* renamed from: f */
    public final C37258g f367777f;

    /* renamed from: g */
    public final C135090fj f367778g;

    /* renamed from: h */
    public final boolean f367779h;

    public C135050dx(C57259bn bnVar, C57252bg bgVar, String str, C134991bw bwVar, C135034dh dhVar, C37258g gVar, C135090fj fjVar, boolean z) {
        C69664n.m101061g(bnVar, "requestReason");
        C69664n.m101061g(str, "ved");
        C69664n.m101061g(dhVar, "requestBehavior");
        C69664n.m101061g(gVar, "requestStartEvent");
        this.f367772a = bnVar;
        this.f367773b = bgVar;
        this.f367774c = str;
        this.f367775d = bwVar;
        this.f367776e = dhVar;
        this.f367777f = gVar;
        this.f367778g = fjVar;
        this.f367779h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135050dx)) {
            return false;
        }
        C135050dx dxVar = (C135050dx) obj;
        return this.f367772a == dxVar.f367772a && C69664n.m101066l(this.f367773b, dxVar.f367773b) && this.f367776e == dxVar.f367776e && C69664n.m101066l(this.f367777f, dxVar.f367777f);
    }

    public final int hashCode() {
        int hashCode = this.f367772a.hashCode() * 31;
        C57252bg bgVar = this.f367773b;
        int hashCode2 = ((((hashCode + (bgVar != null ? bgVar.hashCode() : 0)) * 31) + this.f367776e.hashCode()) * 31) + this.f367777f.hashCode();
        if (this.f367774c.length() == 0) {
            return hashCode2;
        }
        return (hashCode2 * 31) + this.f367774c.hashCode();
    }

    public final String toString() {
        C57259bn bnVar = this.f367772a;
        C57252bg bgVar = this.f367773b;
        String str = this.f367774c;
        C134991bw bwVar = this.f367775d;
        C135034dh dhVar = this.f367776e;
        C37258g gVar = this.f367777f;
        C135090fj fjVar = this.f367778g;
        boolean z = this.f367779h;
        return "RequestConfig(requestReason=" + bnVar + ", feedEntryPointData=" + bgVar + ", ved=" + str + ", feedQueryWithTokenCreator=" + bwVar + ", requestBehavior=" + dhVar + ", requestStartEvent=" + gVar + ", requestMaker=" + fjVar + ", waitForActionUpload=" + z + ")";
    }
}
