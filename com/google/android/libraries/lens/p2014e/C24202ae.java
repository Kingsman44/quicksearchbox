package com.google.android.libraries.lens.p2014e;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.protos.p4963bf.p4964a.p4965a.C64573av;

/* renamed from: com.google.android.libraries.lens.e.ae */
/* compiled from: PG */
public abstract class C24202ae {
    /* renamed from: a */
    public abstract C64573av mo29684a();

    /* renamed from: b */
    public abstract C56220aa mo29685b();

    /* renamed from: c */
    public abstract C56280cg mo29686c();

    /* renamed from: d */
    public static C24202ae m45042d(C56280cg cgVar, C64573av avVar, C56220aa aaVar) {
        if (cgVar == null) {
            throw new NullPointerException("Null appliedFilters");
        } else if (avVar == null) {
            throw new NullPointerException("Null lensModuleOptions");
        } else if (aaVar != null) {
            return new C24219k(cgVar, avVar, aaVar);
        } else {
            throw new NullPointerException("Null predictedObjects");
        }
    }
}
