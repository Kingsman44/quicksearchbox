package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.an */
/* compiled from: PG */
final class C111823an extends C60873d {

    /* renamed from: e */
    public static final /* synthetic */ int f310757e = 0;

    /* renamed from: a */
    public final List f310758a;

    /* renamed from: b */
    public final C113405ep f310759b;

    /* renamed from: c */
    public final C68214a f310760c;

    /* renamed from: d */
    final /* synthetic */ C111825ap f310761d;

    public C111823an(C111825ap apVar, List list, C113405ep epVar, C68214a aVar) {
        this.f310761d = apVar;
        this.f310758a = list;
        this.f310759b = epVar;
        this.f310760c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo99254d(List list, C58528ij ijVar, List list2) {
        long c = this.f310761d.f310774h.mo26871c();
        this.f310761d.f310787u.mo99804e(this.f310759b.mo100016a(), C112976k.ON_DEVICE_RANKING);
        C112705m mVar = (C112705m) this.f310761d.f310782p.mo27525b();
        long a = this.f310759b.mo100016a();
        C89849ae aeVar = C89849ae.TAPAS_ENGINE_START_RANKING;
        mVar.mo99676k(a, aeVar);
        mVar.mo99674i(aeVar, a);
        ((C113389c) this.f310761d.f310790x.mo27525b()).mo99630e(this.f310759b.mo100016a(), "Ranking start");
        C60870cx a2 = ((C111877bo) this.f310760c.mo27525b()).mo99270a(this.f310759b, list);
        new C90873ag(a2, this.f310761d.f310773g, "rankingResponseFuture", new C111820ak(this, c)).mo85223a(new C111821al(this));
        C60870cx g = C60922j.m93044g(a2, new C111822am(this), C60826bg.f164896a);
        if (this.f310761d.f310769c.mo79746e(C90063do.f249461dv)) {
            boolean isEmpty = list2.isEmpty();
            if (isEmpty) {
                mo57358p(this.f310761d.f310773g.mo28209i(g, "Add fast completion flag", new C111816ag(ijVar)));
            }
            new C90873ag(g, this.f310761d.f310773g, "immediateResponseFuture", new C111817ah(this, isEmpty, list2)).mo85223a(C111818ai.f310750a);
            return;
        }
        mo57358p(g);
    }
}
