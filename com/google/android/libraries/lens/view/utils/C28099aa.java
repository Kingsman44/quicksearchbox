package com.google.android.libraries.lens.view.utils;

import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.lens.p4707j.C62494dq;
import com.google.lens.p4707j.C62496ds;

/* renamed from: com.google.android.libraries.lens.view.utils.aa */
/* compiled from: PG */
public final class C28099aa {
    /* renamed from: a */
    public static C62496ds m52378a(C27777bm bmVar, boolean z) {
        C62494dq dqVar = (C62494dq) C62496ds.f168723e.createBuilder();
        dqVar.copyOnWrite();
        C62496ds dsVar = (C62496ds) dqVar.instance;
        dsVar.f168725a |= 2;
        dsVar.f168727c = z;
        if (bmVar.mo33256c() == C24231w.FILTER_SHUTTER || bmVar.mo33256c() == C24231w.RETICLE_SELECTION) {
            dqVar.copyOnWrite();
            C62496ds dsVar2 = (C62496ds) dqVar.instance;
            dsVar2.f168726b = 1;
            dsVar2.f168725a = 1 | dsVar2.f168725a;
        }
        return (C62496ds) dqVar.build();
    }
}
