package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cd */
/* compiled from: PG */
public final class C123037cd implements C123030bx {

    /* renamed from: a */
    private final C123039cf f340603a;

    public C123037cd(C123039cf cfVar) {
        this.f340603a = cfVar;
    }

    /* renamed from: a */
    public final C60870cx mo105840a(C123028bv bvVar, C122561k kVar, C122859d dVar, Function function) {
        C123039cf cfVar = this.f340603a;
        bvVar.getClass();
        function.getClass();
        Executor executor = (Executor) cfVar.f340604a.mo17428b();
        executor.getClass();
        C123036cc ccVar = new C123036cc(bvVar, kVar, dVar, function, executor);
        C60870cx a = ccVar.mo105842a(C52091ex.f136710b);
        C123031by byVar = new C123031by(ccVar);
        return C60922j.m93044g(a, C47810es.m84963c(byVar), C60826bg.f164896a);
    }
}
