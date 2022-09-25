package com.google.android.libraries.lens.p2014e;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.protos.p4963bf.p4964a.p4965a.C64573av;

/* renamed from: com.google.android.libraries.lens.e.k */
/* compiled from: PG */
final class C24219k extends C24202ae {

    /* renamed from: a */
    private final C56280cg f66250a;

    /* renamed from: b */
    private final C64573av f66251b;

    /* renamed from: c */
    private final C56220aa f66252c;

    public C24219k(C56280cg cgVar, C64573av avVar, C56220aa aaVar) {
        this.f66250a = cgVar;
        this.f66251b = avVar;
        this.f66252c = aaVar;
    }

    /* renamed from: a */
    public final C64573av mo29684a() {
        return this.f66251b;
    }

    /* renamed from: b */
    public final C56220aa mo29685b() {
        return this.f66252c;
    }

    /* renamed from: c */
    public final C56280cg mo29686c() {
        return this.f66250a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24202ae) {
            C24202ae aeVar = (C24202ae) obj;
            return this.f66250a.equals(aeVar.mo29686c()) && this.f66251b.equals(aeVar.mo29684a()) && this.f66252c.equals(aeVar.mo29685b());
        }
    }

    public final int hashCode() {
        return ((((this.f66250a.hashCode() ^ 1000003) * 1000003) ^ this.f66251b.hashCode()) * 1000003) ^ this.f66252c.hashCode();
    }

    public final String toString() {
        String obj = this.f66250a.toString();
        String obj2 = this.f66251b.toString();
        String obj3 = this.f66252c.toString();
        return "LensQueryContext{appliedFilters=" + obj + ", lensModuleOptions=" + obj2 + ", predictedObjects=" + obj3 + "}";
    }
}
