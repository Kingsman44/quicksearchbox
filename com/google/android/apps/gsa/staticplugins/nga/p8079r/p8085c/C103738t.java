package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80527x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6284f.C80406b;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.t */
/* compiled from: PG */
public final class C103738t implements C103651a {

    /* renamed from: a */
    private final u f288897a;

    public C103738t(u uVar) {
        this.f288897a = uVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80527x xVar;
        C60870cx cxVar;
        if (bnVar.f219917a == 11) {
            xVar = (C80527x) bnVar.f219918b;
        } else {
            xVar = C80527x.f221059c;
        }
        C80406b bVar = xVar.f221062b;
        if (bVar == null) {
            bVar = C80406b.f220674f;
        }
        String str = bVar.f220678c;
        C65753ak b = C65753ak.m96797b(bVar.f220677b);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        C65753ak akVar = b;
        String str2 = bVar.f220679d;
        long j = bVar.f220680e;
        if ((bVar.f220676a & 8) != 0) {
            cxVar = this.f288897a.b(str, akVar, str2, j, false);
        } else {
            cxVar = this.f288897a.a(str, akVar, str2);
        }
        return C60922j.m93044g(cxVar, C47810es.m84963c(C103737s.f288896a), C60826bg.f164896a);
    }
}
