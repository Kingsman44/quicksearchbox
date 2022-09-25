package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.search.logging.p3034a.C38763l;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.af.as */
/* compiled from: PG */
public final class C25047as {

    /* renamed from: a */
    public static final C58974d f68274a = C58974d.m91135i("LensClearcutCounters");

    /* renamed from: b */
    private final C46423aj f68275b;

    /* renamed from: c */
    private final Executor f68276c;

    public C25047as(C38763l lVar, Executor executor) {
        this.f68275b = new C46423aj(new C25045aq(lVar), executor);
        this.f68276c = executor;
    }

    /* renamed from: a */
    public final void mo30239a(Consumer consumer) {
        C60870cx b = this.f68275b.mo50395b();
        C25046ar arVar = new C25046ar(consumer);
        C60856cj.m92911t(b, C47810es.m84974n(arVar), this.f68276c);
    }
}
