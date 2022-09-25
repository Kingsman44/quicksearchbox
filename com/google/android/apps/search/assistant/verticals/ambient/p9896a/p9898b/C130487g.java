package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131199f;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131208o;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.b.g */
/* compiled from: PG */
public final class C130487g {

    /* renamed from: a */
    public final C131208o f357469a;

    /* renamed from: b */
    public final C60887da f357470b;

    /* renamed from: c */
    public final C60950i f357471c;

    /* renamed from: d */
    private final C62910ar f357472d;

    public C130487g(C131208o oVar, C60887da daVar, C60950i iVar, long j) {
        this.f357469a = oVar;
        this.f357470b = daVar;
        this.f357471c = iVar;
        this.f357472d = C62948a.m95462m(j, 0);
    }

    /* renamed from: a */
    public final C60870cx mo109708a(C131258a aVar, C106596h hVar, C53715bm bmVar, Object obj, Object obj2) {
        C60870cx cxVar;
        C58485gu d = aVar.mo110138d();
        if (d.size() != 1) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = mo109709b((C50794cr) d.get(0));
        }
        C130485e eVar = new C130485e(obj2, aVar, hVar, bmVar, obj);
        return C60922j.m93045h(cxVar, C47810es.m84966f(eVar), this.f357470b);
    }

    /* renamed from: b */
    public final C60870cx mo109709b(C50794cr crVar) {
        C60870cx cxVar;
        C131208o oVar = this.f357469a;
        C62910ar arVar = this.f357472d;
        if (crVar.equals(C50794cr.UNDEFINED)) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            C60870cx d = oVar.f358822a.mo46042d();
            C131199f fVar = new C131199f(oVar, crVar, arVar);
            cxVar = C60922j.m93044g(d, C47810es.m84963c(fVar), oVar.f358823b);
        }
        C130481a aVar = C130481a.f357457a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(aVar), this.f357470b);
    }
}
