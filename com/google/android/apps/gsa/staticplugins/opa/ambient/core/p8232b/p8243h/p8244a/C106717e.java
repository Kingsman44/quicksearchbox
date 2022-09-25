package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.p8244a;

import com.google.android.apps.gsa.n.g.c;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106724d;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.h.a.e */
/* compiled from: PG */
public final class C106717e implements C106724d {

    /* renamed from: a */
    public final C58974d f297421a;

    /* renamed from: b */
    public final C83807w f297422b;

    /* renamed from: c */
    public final C130895ag f297423c;

    /* renamed from: d */
    private final i f297424d;

    /* renamed from: e */
    private final C86054o f297425e;

    /* renamed from: f */
    private final C60887da f297426f;

    /* renamed from: g */
    private final AtomicReference f297427g = new AtomicReference(false);

    public C106717e(i iVar, C86054o oVar, C60887da daVar, C83807w wVar, C83564a aVar, C130895ag agVar) {
        this.f297424d = iVar;
        this.f297425e = oVar;
        this.f297422b = wVar;
        this.f297426f = daVar;
        this.f297421a = aVar.mo76901b(this);
        this.f297423c = agVar;
    }

    /* renamed from: a */
    public final C60870cx mo95624a(C65753ak akVar, MessageLite messageLite, String str) {
        C60870cx b = mo95625b(akVar, messageLite, str);
        C106714b bVar = C106714b.f297415a;
        return C60922j.m93044g(b, C47810es.m84963c(bVar), this.f297426f);
    }

    /* renamed from: b */
    public final C60870cx mo95625b(C65753ak akVar, MessageLite messageLite, String str) {
        C60870cx cxVar;
        String F = this.f297425e.mo79659F();
        if (F == null) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            C60870cx h = C60922j.m93045h((C60870cx) this.f297424d.a.mo6453a(), new c(F, akVar, str, C63662ac.f172144a), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            C106715c cVar = new C106715c(this, messageLite);
            cxVar = C60922j.m93044g(h, C47810es.m84963c(cVar), this.f297426f);
        }
        if (akVar == C65753ak.HABITS_AA_PROFILES) {
            C106716d dVar = new C106716d(this, str, !((Boolean) this.f297427g.getAndSet(true)).booleanValue());
            C60856cj.m92911t(cxVar, C47810es.m84974n(dVar), this.f297426f);
        }
        return cxVar;
    }
}
