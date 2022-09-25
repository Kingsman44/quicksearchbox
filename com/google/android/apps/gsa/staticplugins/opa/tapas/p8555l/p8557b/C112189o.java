package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90035cn;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113131ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113371dl;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19152am;
import com.google.android.libraries.assistant.p1594s.p1597b.C19153an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.o */
/* compiled from: PG */
public final class C112189o {

    /* renamed from: a */
    public static final C59071e f311481a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.o");

    /* renamed from: b */
    public static final C121537f f311482b = C121537f.m200840b("Tapas/RankingConfigHelper", C121511c.f337208a);

    /* renamed from: c */
    public final C113131ap f311483c;

    /* renamed from: d */
    public final C113131ap f311484d;

    /* renamed from: e */
    public final C113131ap f311485e;

    /* renamed from: f */
    public final C86124t f311486f;

    /* renamed from: g */
    private final C113131ap f311487g;

    public C112189o(C86124t tVar) {
        this.f311483c = new C113131ap(tVar, C112183i.f311475a, C90063do.f249542fW);
        this.f311484d = new C113131ap(tVar, C112184j.f311476a, C90063do.f249481eO);
        this.f311485e = new C113131ap(tVar, C112185k.f311477a, C90035cn.f248386k);
        this.f311487g = new C113131ap(tVar, C112186l.f311478a, C90063do.f249565ft);
        this.f311486f = tVar;
    }

    /* renamed from: c */
    private static C58495hd m186071c(C19153an anVar) {
        C58490gz gzVar = new C58490gz(4);
        for (C19152am amVar : anVar.f53646a) {
            C48670ae a = C48670ae.m85256a(amVar.f53642b);
            if (a == null) {
                a = C48670ae.SUGGESTION_GROUP_FALLBACK;
            }
            gzVar.mo55429h(Integer.valueOf(C113371dl.m187571a(a)), Integer.valueOf(amVar.f53643c));
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C58485gu mo99464a() {
        return (C58485gu) this.f311487g.get();
    }

    /* renamed from: b */
    public final C58495hd mo99465b(C113405ep epVar) {
        if (TextUtils.isEmpty(C113190cu.m187215c(epVar.mo100033p()))) {
            C19141ab abVar = epVar.mo100022f().f53685m;
            if (abVar == null) {
                abVar = C19141ab.f53614i;
            }
            C19153an anVar = abVar.f53621g;
            if (anVar == null) {
                anVar = C19153an.f53644b;
            }
            return m186071c(anVar);
        }
        C19141ab abVar2 = epVar.mo100022f().f53685m;
        if (abVar2 == null) {
            abVar2 = C19141ab.f53614i;
        }
        C19153an anVar2 = abVar2.f53622h;
        if (anVar2 == null) {
            anVar2 = C19153an.f53644b;
        }
        return m186071c(anVar2);
    }
}
