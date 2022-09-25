package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81215fj;
import com.google.android.apps.gsa.nga.shared.p6407v.C83278h;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3039b.C38830b;
import com.google.android.libraries.search.logging.p3039b.C38833e;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ap */
/* compiled from: PG */
public final class C112678ap {

    /* renamed from: a */
    public static final C59071e f312305a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ap");

    /* renamed from: b */
    public final C68214a f312306b;

    /* renamed from: c */
    public final C86054o f312307c;

    /* renamed from: d */
    public final C21370a f312308d;

    /* renamed from: e */
    public final C85757cq f312309e;

    /* renamed from: f */
    public final u f312310f;

    /* renamed from: g */
    public final C22871g f312311g;

    /* renamed from: h */
    public final C86124t f312312h;

    /* renamed from: i */
    public final C112685aw f312313i;

    /* renamed from: j */
    public final ae f312314j;

    /* renamed from: k */
    public final String f312315k;

    /* renamed from: l */
    public final C22871g f312316l;

    /* renamed from: m */
    public final C83278h f312317m;

    /* renamed from: n */
    public final C113812ca f312318n;

    /* renamed from: o */
    public final C81215fj f312319o;

    /* renamed from: p */
    private final C38830b f312320p;

    /* renamed from: q */
    private final C38833e f312321q;

    static {
        C121537f.m200840b("Tapas/TapasQueryLogger", C121511c.f337208a);
    }

    public C112678ap(C38830b bVar, C68214a aVar, C38833e eVar, C86054o oVar, C21370a aVar2, C113812ca caVar, C85757cq cqVar, u uVar, C22871g gVar, C86124t tVar, C112685aw awVar, ae aeVar, C83278h hVar, C81215fj fjVar, String str, C22871g gVar2) {
        this.f312320p = bVar;
        this.f312306b = aVar;
        this.f312321q = eVar;
        this.f312307c = oVar;
        this.f312308d = aVar2;
        this.f312318n = caVar;
        this.f312309e = cqVar;
        this.f312310f = uVar;
        this.f312311g = gVar;
        this.f312312h = tVar;
        this.f312313i = awVar;
        this.f312314j = aeVar;
        this.f312317m = hVar;
        this.f312319o = fjVar;
        this.f312315k = str;
        this.f312316l = gVar2;
    }

    /* renamed from: a */
    public static String m186472a(C112667ae aeVar) {
        C112695c cVar = (C112695c) aeVar;
        if (cVar.f312418b.mo100195H().isPresent()) {
            return ((C48578al) cVar.f312418b.mo100195H().get()).f125508b;
        }
        C113415ez ezVar = cVar.f312418b;
        int f = ezVar.mo100206f();
        if (f != 20010) {
            return f != 20014 ? BuildConfig.FLAVOR : ezVar.mo100199L();
        }
        return String.format("open %s", new Object[]{ezVar.mo100199L()});
    }

    /* renamed from: b */
    public final void mo99625b(C112667ae aeVar, C60548tz tzVar, C19087s sVar) {
        new C90873ag(this.f312320p.mo41663a((C60555uf) tzVar.build(), this.f312321q), this.f312311g, "[Tapas] send log event", new C112670ah(this, sVar, aeVar)).mo85223a(C112671ai.f312292a);
    }
}
