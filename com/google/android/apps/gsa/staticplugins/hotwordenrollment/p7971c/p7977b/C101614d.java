package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101771k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.d */
/* compiled from: PG */
public final class C101614d implements C101771k {

    /* renamed from: b */
    private static final C59071e f283549b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.d");

    /* renamed from: a */
    public final C101771k f283550a;

    public C101614d(C89994f fVar, C74555u uVar, C101629s sVar, C86124t tVar, String str) {
        C101626p pVar;
        C74544ae e = uVar.mo70887e();
        C9439b a = uVar.mo70883a();
        C59071e eVar = f283549b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20350)).mo56389s("phoneFlowType = %s", e.mo70854b());
        C101611a aVar = new C101611a();
        boolean z = true;
        aVar.f283533a = 1;
        aVar.mo92427c(true);
        aVar.mo92428d(true);
        aVar.mo92429e(true);
        aVar.mo92426b(true);
        af afVar = af.a;
        int ordinal = e.mo70854b().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    aVar.f283533a = 2;
                    pVar = sVar.mo92451a(aVar.mo92425a());
                } else if (ordinal == 3) {
                    aVar.mo92427c(false);
                    aVar.mo92428d(false);
                    aVar.mo92429e(!tVar.mo79746e(C90082eg.f250061dr));
                    pVar = sVar.mo92451a(aVar.mo92425a());
                } else if (ordinal != 4) {
                    if (ordinal == 5) {
                        aVar.mo92426b(false);
                        if (e.mo70853a().mo70880d()) {
                            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20353)).mo56386p("wearOS enrollment");
                            aVar.mo92428d(false);
                            if (e.mo70853a().mo70881e()) {
                                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20354)).mo56386p("wearOS retrain");
                                aVar.f283533a = 2;
                                pVar = sVar.mo92451a(aVar.mo92425a());
                            } else {
                                pVar = sVar.mo92451a(aVar.mo92425a());
                            }
                        } else if (fVar.mo83825n(str)) {
                            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20352)).mo56386p("bisto has model already");
                            aVar.f283533a = 3;
                            pVar = sVar.mo92451a(aVar.mo92425a());
                        } else {
                            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(20351)).mo56386p("default bisto");
                            pVar = sVar.mo92451a(aVar.mo92425a());
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            }
            aVar.mo92428d(false);
            aVar.mo92426b(false);
            pVar = sVar.mo92451a(aVar.mo92425a());
        } else {
            aVar.mo92428d((a == C9439b.OPA_DREAMLINER_ONBOARDING || a == C9439b.OPA_AMBIENT_MODE_ONBOARDING) ? false : z);
            pVar = sVar.mo92451a(aVar.mo92425a());
        }
        this.f283550a = pVar;
    }
}
