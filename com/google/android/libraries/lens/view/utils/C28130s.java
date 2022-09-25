package com.google.android.libraries.lens.view.utils;

import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.common.p4522b.C58557jl;
import com.google.lens.p4707j.C62471cu;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56258bl;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56279cf;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.utils.s */
/* compiled from: PG */
public final class C28130s {
    /* renamed from: a */
    public static C25980d m52410a(C62471cu cuVar) {
        int i = cuVar.f168678a;
        if (i == 1 || i == 3) {
            return C25980d.TEXT;
        }
        if (i == 2) {
            return C25980d.TRANSLATE;
        }
        if (i == 4) {
            return C25980d.DINING;
        }
        if (i == 5) {
            return C25980d.SHOPPING;
        }
        if (i == 6) {
            return C25980d.OUTDOOR;
        }
        if (i == 7) {
            return C25980d.EDUCATION;
        }
        return C25980d.AUTO_FILTER;
    }

    /* renamed from: b */
    public static C56280cg m52411b(C56306df dfVar) {
        C56279cf cfVar = (C56279cf) C56280cg.f149992b.createBuilder();
        C56258bl blVar = (C56258bl) C56278ce.f149986e.createBuilder();
        blVar.copyOnWrite();
        C56278ce ceVar = (C56278ce) blVar.instance;
        ceVar.f149991d = dfVar.f150068m;
        ceVar.f149988a |= 1;
        cfVar.copyOnWrite();
        C56280cg cgVar = (C56280cg) cfVar.instance;
        C56278ce ceVar2 = (C56278ce) blVar.build();
        ceVar2.getClass();
        cgVar.mo54347a();
        cgVar.f149994a.add(ceVar2);
        return (C56280cg) cfVar.build();
    }

    /* renamed from: c */
    public static boolean m52412c(C56280cg cgVar, C56306df dfVar) {
        return C58557jl.m90122c(cgVar.f149994a, new C28129r(dfVar)).mo56113h();
    }
}
