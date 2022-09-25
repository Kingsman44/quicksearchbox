package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f.p8262a;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106432a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106559h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8218e.C106547a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106574a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106575b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8224k.C106582i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C106973d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f.C107040e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8265a.C107043b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.MessageLite;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.a.p */
/* compiled from: PG */
public final class C107035p implements C107040e {

    /* renamed from: a */
    public final C58881cr f298059a;

    /* renamed from: b */
    public final C106432a f298060b;

    /* renamed from: c */
    public final C106973d f298061c;

    /* renamed from: d */
    public final C60887da f298062d;

    /* renamed from: e */
    public final C60836bq f298063e = new C60836bq();

    /* renamed from: f */
    public final C58974d f298064f;

    /* renamed from: g */
    public final AtomicReference f298065g = new AtomicReference();

    /* renamed from: h */
    private final C106559h f298066h;

    public C107035p(C106432a aVar, C106973d dVar, Set set, C106559h hVar, C106582i iVar, C60887da daVar, C86124t tVar, C83564a aVar2) {
        C60870cx cxVar;
        this.f298060b = aVar;
        this.f298061c = dVar;
        this.f298066h = hVar;
        this.f298062d = daVar;
        C58974d a = aVar2.mo76900a("AA.Context");
        this.f298064f = a;
        this.f298059a = C58886cw.m90973a(new C107032m(this, set));
        mo95740e();
        C107043b.m177757a(a, hVar.mo95577b(new C107021b(this)), "onFailure(): resetTriggerMonitor addListener call failed.", new Object[0]);
        if (tVar.mo79746e(C90017bw.f247971bg)) {
            C106551f fVar = iVar.f297174c;
            if (fVar != null) {
                C106574a aVar3 = (C106574a) C106575b.f297162e.createBuilder();
                aVar3.copyOnWrite();
                C106575b bVar = (C106575b) aVar3.instance;
                bVar.f297164a |= 2;
                bVar.f297166c = true;
                cxVar = C118826c.m197213c(((C106547a) fVar).f297123a.mo95579e((C106575b) aVar3.build()));
            } else {
                cxVar = C118826c.f331423b;
            }
            C107043b.m177757a(a, cxVar, "onFailure(): restoring UserContext failed.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final C60870cx mo95738a(C106546e eVar, MessageLite messageLite) {
        return this.f298063e.mo57305b(new C107024e(this, eVar, messageLite), this.f298062d);
    }

    /* renamed from: c */
    public final C106596h mo17428b() {
        return (C106596h) Optional.ofNullable((C106596h) this.f298065g.get()).orElse(C106596h.f297204n);
    }

    /* renamed from: e */
    public final void mo95740e() {
        for (C107034o oVar : (Set) this.f298059a.mo6453a()) {
            C107043b.m177757a(oVar.f298058c.f298064f, oVar.f298056a.mo95577b(oVar.f298057b), "startMonitoring.onFailure(): triggerMonitor addListener call failed.", new Object[0]);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85286m(this.f298060b);
        fVar.mo85286m(this.f298066h);
        for (C107034o m : (Set) this.f298059a.mo6453a()) {
            fVar.mo85286m(m);
        }
    }
}
