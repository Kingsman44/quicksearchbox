package com.google.android.apps.gsa.nga.engine.p6098r.p6099a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.C128047g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.r.a.t */
/* compiled from: PG */
public final class C77493t extends C77488o {

    /* renamed from: a */
    private final Executor f213542a;

    /* renamed from: b */
    private final C128047g f213543b;

    public C77493t(Executor executor, C128047g gVar) {
        this.f213542a = executor;
        this.f213543b = gVar;
    }

    /* renamed from: b */
    public final void mo72589b(C70862aj ajVar) {
        C60870cx a = this.f213543b.mo72588a();
        C77492s sVar = new C77492s(ajVar, a);
        C60856cj.m92911t(a, C47810es.m84974n(sVar), this.f213542a);
        C70148al.m102135m().mo61700d(new C77491r(a), this.f213542a);
    }
}
