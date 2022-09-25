package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2794d.C36494c;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36537i;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36542n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.af */
/* compiled from: PG */
public final class C36560af extends C36537i {

    /* renamed from: a */
    private final C36579g f95358a;

    /* renamed from: b */
    private final Executor f95359b;

    public C36560af(C36579g gVar, Executor executor) {
        this.f95358a = gVar;
        this.f95359b = executor;
    }

    /* renamed from: b */
    public final void mo40216b(C36542n nVar, C70862aj ajVar) {
        C36579g gVar = this.f95358a;
        C36577e eVar = new C36577e(gVar, nVar, Optional.ofNullable((C36476g) C36494c.f95248d.mo61711a(C70148al.m102135m())));
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(eVar), gVar.f95391d);
        C36559ae aeVar = new C36559ae(ajVar);
        C60856cj.m92911t(n, C47810es.m84974n(aeVar), this.f95359b);
    }
}
