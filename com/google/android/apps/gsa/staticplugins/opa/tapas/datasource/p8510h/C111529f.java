package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8510h;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.assistant.p3781ad.p3789d.C48571ae;
import com.google.assistant.p3781ad.p3789d.C48575ai;
import com.google.assistant.p3781ad.p3789d.C48576aj;
import com.google.assistant.p3781ad.p3789d.C48577ak;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3860as.C49740ac;
import com.google.assistant.p3860as.C49754aq;
import com.google.assistant.p3860as.C49758au;
import com.google.assistant.p3860as.C49775bk;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.f */
/* compiled from: PG */
public final /* synthetic */ class C111529f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111530g f310213a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f310214b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f310215c;

    public /* synthetic */ C111529f(C111530g gVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f310213a = gVar;
        this.f310214b = cxVar;
        this.f310215c = cxVar2;
    }

    public final Object call() {
        C49740ac acVar;
        C111530g gVar = this.f310213a;
        C60870cx cxVar = this.f310214b;
        C48635bx bxVar = (C48635bx) C60856cj.m92909r(this.f310215c);
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue() || (gVar.f310216a.mo79746e(C90063do.f249581gI) && !gVar.f310217b.mo100143i())) {
            C58976aa aaVar = C58975e.f156826a;
            return C113408es.f314036b;
        }
        if (bxVar.f125706a == 3) {
            acVar = (C49740ac) bxVar.f125707b;
        } else {
            acVar = C49740ac.f128432e;
        }
        C58480gp e = C58485gu.m89837e();
        C62971cq<C49754aq> cqVar = acVar.f128437d;
        C58480gp e2 = C58485gu.m89837e();
        for (C49754aq aqVar : cqVar) {
            C58976aa aaVar2 = C58975e.f156826a;
            C49758au auVar = aqVar.f128483a;
            if (auVar == null) {
                auVar = C49758au.f128490b;
            }
            if (auVar.f128492a.size() > 0) {
                C49758au auVar2 = aqVar.f128483a;
                if (auVar2 == null) {
                    auVar2 = C49758au.f128490b;
                }
                String str = ((C49775bk) auVar2.f128492a.get(0)).f128531a;
                int i = ((C49775bk) auVar2.f128492a.get(0)).f128532b;
                C48571ae aeVar = (C48571ae) C48576aj.f125494h.createBuilder();
                C48575ai aiVar = C48575ai.PRIVATE;
                aeVar.copyOnWrite();
                C48576aj ajVar = (C48576aj) aeVar.instance;
                ajVar.f125498c = aiVar.f125493d;
                ajVar.f125496a |= 2;
                C113414ey q = gVar.mo100187q();
                q.mo100164i(str);
                q.mo100180y(10050);
                q.mo100177v(C48580an.HABIT_QUERY);
                q.mo100167l(10001);
                q.mo100172q(C113300by.QUERY_TEXT);
                C48577ak akVar = (C48577ak) C48578al.f125505d.createBuilder();
                akVar.mo53158a((C48576aj) aeVar.build());
                q.mo100178w((C48578al) akVar.build());
                C112142i iVar = C112142i.DISPLAY_TEXT;
                C112141h hVar = (C112141h) C112144k.f311414b.createBuilder();
                hVar.mo99420b(C58890d.m90988c(str), 1.0f);
                q.mo100173r(C58495hd.m89900n(iVar, (C112144k) hVar.build()));
                q.mo100171p(C111583h.f310313a);
                e2.mo55395g(q.mo100156a());
            }
        }
        e.mo55396h(e2.mo55394f());
        C58976aa aaVar3 = C58975e.f156826a;
        int i2 = ((C58724pq) e.mo55394f()).f156474d;
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(e.mo55394f())));
        return p.mo100091a();
    }
}
