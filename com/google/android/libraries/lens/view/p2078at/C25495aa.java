package com.google.android.libraries.lens.view.p2078at;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.lens.view.at.aa */
/* compiled from: PG */
public final /* synthetic */ class C25495aa {
    /* renamed from: a */
    public static void m46954a(C25496ab abVar, C25497ac acVar, C25497ac acVar2, C25533p pVar) {
        C58838bb.m90873h((acVar2 == C25497ac.FROZEN) == (pVar != null), "Unexpected FrozenImageConfig in mode %s", acVar2);
        if (acVar != acVar2 || acVar == C25497ac.FROZEN) {
            C25497ac acVar3 = C25497ac.FROZEN;
            if (acVar == acVar3 && acVar2 != acVar3) {
                abVar.mo30523kZ();
            }
            C25497ac acVar4 = C25497ac.LIVE;
            if (acVar == acVar4) {
                abVar.mo30521kX(false);
            } else if (acVar2 == acVar4) {
                abVar.mo30521kX(true);
            }
            if (acVar2 == C25497ac.FROZEN) {
                pVar.getClass();
                abVar.mo30520kW(pVar);
            }
            abVar.mo30522kY(acVar, acVar2, pVar);
        }
    }
}
