package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.b.f.t */
/* compiled from: PG */
public final class C17157t {

    /* renamed from: a */
    public static final C58974d f49864a = C58974d.m91136j();

    /* renamed from: a */
    public static C60870cx m34305a(C60870cx cxVar) {
        C17153p pVar = C17153p.f49857a;
        return C60846c.m92879h(cxVar, C70761fa.class, C47810es.m84966f(pVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public static void m34306b(C70148al alVar, C60870cx cxVar, C70862aj ajVar, Executor executor, boolean z) {
        alVar.mo61700d(new C17152o(cxVar), executor);
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C17154q(ajVar, z)), executor);
    }

    /* renamed from: c */
    public static void m34307c(Throwable th, C70862aj ajVar) {
        String format = String.format("%s: %s", new Object[]{th.getClass().getName(), th.getLocalizedMessage()});
        if ((th instanceof C70761fa) || (th instanceof StatusException)) {
            ajVar.mo20122b(th);
        } else if (th instanceof CancellationException) {
            ajVar.mo20122b(new C70761fa(Status.f186904b.withDescription(format), (C70334de) null, true));
        } else if (th instanceof TimeoutException) {
            ajVar.mo20122b(new C70761fa(Status.f186907e.withDescription(format), (C70334de) null, true));
        } else {
            ajVar.mo20122b(new C70761fa(Status.f186905c.withDescription(format), (C70334de) null, true));
        }
    }
}
