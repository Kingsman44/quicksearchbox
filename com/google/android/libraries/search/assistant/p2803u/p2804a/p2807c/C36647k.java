package com.google.android.libraries.search.assistant.p2803u.p2804a.p2807c;

import com.google.android.libraries.search.assistant.p2803u.p2819c.C36769c;
import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.ahg;
import com.google.assistant.p3861at.ahh;
import com.google.assistant.p3861at.aii;
import com.google.assistant.p3861at.aij;
import com.google.assistant.p3861at.aik;
import com.google.assistant.p3861at.ain;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.u.a.c.k */
/* compiled from: PG */
public final /* synthetic */ class C36647k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36656t f95502a;

    /* renamed from: b */
    public final /* synthetic */ C36769c f95503b;

    public /* synthetic */ C36647k(C36656t tVar, C36769c cVar) {
        this.f95502a = tVar;
        this.f95503b = cVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C36656t tVar = this.f95502a;
        C36769c cVar = this.f95503b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(false);
        }
        ((C59052c) ((C59052c) C36656t.f95515a.mo56224b()).mo56372aa(51518)).mo56386p("fetchAccountData");
        if (!tVar.f95519e.mo56113h()) {
            return C60856cj.m92900i(false);
        }
        ahg ahg = (ahg) ahh.f129301g.createBuilder();
        aii aii = (aii) ain.f129411h.createBuilder();
        aij aij = (aij) aik.f129402c.createBuilder();
        aij.copyOnWrite();
        aik aik = (aik) aij.instance;
        aik.f129404a |= 1;
        aik.f129405b = true;
        aii.copyOnWrite();
        ain ain = (ain) aii.instance;
        aik aik2 = (aik) aij.build();
        aik2.getClass();
        ain.f129416d = aik2;
        ain.f129413a |= 2;
        if (!tVar.f95520f.mo56113h()) {
            ahh ahh = (ahh) ahg.build();
            aii.copyOnWrite();
            ain ain2 = (ain) aii.instance;
            ahh.getClass();
            ain2.f129415c = ahh;
            ain2.f129414b = 1;
            acu acu = (acu) acv.f128920X.createBuilder();
            ain ain3 = (ain) aii.build();
            acu.copyOnWrite();
            acv acv = (acv) acu.instance;
            ain3.getClass();
            acv.f128929H = ain3;
            acv.f128946b |= 4096;
            acu.copyOnWrite();
            acv acv2 = (acv) acu.instance;
            acv2.f128946b |= 8388608;
            acv2.f128934M = true;
            cxVar = C60856cj.m92900i((acv) acu.build());
        } else {
            cxVar = C60922j.m93044g(((C38487e) tVar.f95520f.mo56107c()).mo41441a(), C47810es.m84963c(new C36652p(ahg, aii)), C60826bg.f164896a);
        }
        return C60922j.m93044g(C60922j.m93045h(cxVar, C47810es.m84966f(new C36650n(tVar)), C60826bg.f164896a), C47810es.m84963c(new C36651o(cVar)), tVar.f95517c);
    }
}
