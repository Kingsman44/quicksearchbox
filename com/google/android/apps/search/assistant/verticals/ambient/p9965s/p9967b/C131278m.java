package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b.C130487g;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.C131258a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.b.m */
/* compiled from: PG */
public final class C131278m implements C131258a {

    /* renamed from: a */
    public final C58974d f358936a;

    /* renamed from: b */
    public final C130487g f358937b;

    /* renamed from: c */
    public final ExecutorService f358938c;

    /* renamed from: d */
    public final C131258a f358939d;

    /* renamed from: e */
    public final C131258a f358940e;

    /* renamed from: f */
    public final boolean f358941f;

    public C131278m(C130603a aVar, C130487g gVar, ExecutorService executorService, C131258a aVar2, C131258a aVar3, boolean z) {
        this.f358936a = aVar.mo109740b(this);
        this.f358937b = gVar;
        this.f358938c = executorService;
        this.f358939d = aVar2;
        this.f358940e = aVar3;
        this.f358941f = z;
    }

    /* renamed from: a */
    public final C60870cx mo110139e(C106596h hVar, C53715bm bmVar, C58485gu guVar) {
        C60870cx b = this.f358937b.mo109709b(C50794cr.AT_STORE_COMBINED_CARD);
        C131271f fVar = new C131271f(this, hVar, bmVar, guVar);
        return C60922j.m93045h(b, C47810es.m84966f(fVar), this.f358938c);
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        return C58485gu.m89848p(C50794cr.SHOPPING_LIST, C50794cr.LOYALTY_CARD, C50794cr.AT_STORE_COMBINED_CARD);
    }
}
