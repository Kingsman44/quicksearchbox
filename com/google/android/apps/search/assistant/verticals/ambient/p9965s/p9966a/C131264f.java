package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9966a;

import android.content.Context;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130804f;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c.C130773c;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c.C130774d;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c.C130786p;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.a.f */
/* compiled from: PG */
public final class C131264f implements C131258a {

    /* renamed from: a */
    public final Context f358913a;

    /* renamed from: b */
    public final C130895ag f358914b;

    /* renamed from: c */
    private final C60887da f358915c;

    /* renamed from: d */
    private final C130804f f358916d;

    public C131264f(C130603a aVar, C60887da daVar, C130804f fVar, Context context, C130895ag agVar) {
        aVar.mo109740b(this);
        this.f358915c = daVar;
        this.f358916d = fVar;
        this.f358913a = context;
        this.f358914b = agVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo110140a(C106596h hVar) {
        C58485gu guVar = (C58485gu) Collection.EL.stream(hVar.f297214i).map(C131261c.f358910a).filter(C131262d.f358911a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C130804f fVar = this.f358916d;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(guVar).map(new C130773c((C130786p) fVar)).collect(C58370cn.f155946a);
        C60870cx a = C47638k.m84750a(guVar2).mo51520a(new C130774d((C130786p) fVar, guVar, guVar2), ((C130786p) fVar).f358008b);
        C131263e eVar = new C131263e(this);
        return C60922j.m93044g(a, C47810es.m84963c(eVar), this.f358915c);
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89845m();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Void voidR = (Void) obj;
        return mo110140a(hVar);
    }
}
