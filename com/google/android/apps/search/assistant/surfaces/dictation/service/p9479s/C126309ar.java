package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.ar */
/* compiled from: PG */
public final class C126309ar {
    /* renamed from: a */
    public static C60870cx m206522a(C60870cx cxVar) {
        C126298ag agVar = C126298ag.f347957a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(agVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public static C60870cx m206523b(C60930r rVar) {
        C70148al n;
        C70148al a;
        try {
            n = C70148al.m102135m().mo61716n();
            Objects.requireNonNull(rVar);
            C126304am amVar = new C126304am(rVar);
            a = n.mo61696a();
            Object call = amVar.call();
            n.mo61702f(a);
            return (C60870cx) call;
        } catch (Exception e) {
            return C60856cj.m92899h(e);
        } catch (Throwable th) {
            n.mo61702f(a);
            throw th;
        }
    }

    /* renamed from: c */
    public static C60870cx m206524c(C60930r rVar, Duration duration, C60888db dbVar) {
        return C60856cj.m92902k(C47810es.m84965e(rVar), duration.toNanos(), TimeUnit.NANOSECONDS, dbVar);
    }

    /* renamed from: d */
    public static C60870cx m206525d(Iterable iterable) {
        return C47638k.m84750a(iterable).mo51520a(new C126305an(iterable), C60826bg.f164896a);
    }

    /* renamed from: e */
    public static C60870cx m206526e(C60870cx cxVar, Duration duration, C60888db dbVar) {
        return C60856cj.m92908q(cxVar, duration.toMillis(), TimeUnit.MILLISECONDS, dbVar);
    }

    /* renamed from: f */
    public static C60870cx m206527f(C60870cx cxVar, Object obj) {
        C126302ak akVar = new C126302ak(obj);
        return C60922j.m93044g(cxVar, C47810es.m84963c(akVar), C60826bg.f164896a);
    }

    /* renamed from: g */
    public static void m206528g(C60870cx cxVar, C70862aj ajVar, Executor executor, String str, Object... objArr) {
        C126306ao aoVar = new C126306ao(ajVar);
        Objects.requireNonNull(ajVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C126308aq(aoVar, new C126307ap(ajVar))), executor);
        C46459k.m82829b(cxVar, str, objArr);
    }

    /* renamed from: h */
    public static boolean m206529h(Future future) {
        if (future.isDone() && !future.isCancelled()) {
            try {
                C60856cj.m92909r(future);
                return true;
            } catch (ExecutionException unused) {
            }
        }
        return false;
    }
}
