package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.location.p5873a.C74632a;
import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b.C120125a;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b.C120127c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71548cy;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.br */
/* compiled from: PG */
public final /* synthetic */ class C102936br implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102962cq f287444a;

    /* renamed from: b */
    public final /* synthetic */ C102960co f287445b;

    /* renamed from: c */
    public final /* synthetic */ C102960co f287446c;

    public /* synthetic */ C102936br(C102962cq cqVar, C102960co coVar, C102960co coVar2) {
        this.f287444a = cqVar;
        this.f287445b = coVar;
        this.f287446c = coVar2;
    }

    public final void run() {
        Object e;
        C102962cq cqVar = this.f287444a;
        C102960co coVar = this.f287445b;
        C102960co coVar2 = this.f287446c;
        if (coVar == null || ((C102979h) coVar2).f287556a != ((C102979h) coVar).f287556a) {
            for (C74718bv a : (Set) cqVar.f287505e.mo27525b()) {
                a.mo17497a(((C102979h) coVar2).f287556a);
            }
            for (C74718bv a2 : cqVar.f287511k) {
                a2.mo17497a(((C102979h) coVar2).f287556a);
            }
            C102927bi biVar = (C102927bi) cqVar.f287514n.mo27525b();
            if (!biVar.f287423d.isEmpty()) {
                C60856cj.m92911t(C60838bs.m92859i(((C74632a) biVar.f287423d.get()).mo71010a()), new C102926bh(biVar), biVar.f287421b);
            }
        }
        if (coVar == null || !Objects.equals(((C102979h) coVar2).f287557b, ((C102979h) coVar).f287557b)) {
            C120125a aVar = ((C102979h) coVar2).f287557b;
            C71548cy cyVar = ((C120127c) cqVar.f287515o.mo27525b()).f334365c;
            do {
                e = cyVar.mo62784e();
                C120125a aVar2 = (C120125a) e;
            } while (!cyVar.mo62808g(e, aVar));
        }
    }
}
