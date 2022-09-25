package com.google.apps.tiktok.tracing.contrib.p3700b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.tracing.contrib.b.f */
/* compiled from: PG */
public final class C47633f extends C60842bw {
    private C47633f(C60870cx cxVar) {
        super(cxVar);
    }

    /* renamed from: g */
    public static C47633f m84733g(C60870cx cxVar) {
        if (cxVar instanceof C47633f) {
            return (C47633f) cxVar;
        }
        return new C47633f(cxVar);
    }

    /* renamed from: e */
    public final C47633f mo51513e(Class cls, C58817ah ahVar, Executor executor) {
        return new C47633f(C60846c.m92878g(this.f164926b, cls, C47810es.m84963c(ahVar), executor));
    }

    /* renamed from: f */
    public final C47633f mo51514f(Class cls, C60931s sVar, Executor executor) {
        return new C47633f(C60846c.m92879h(this.f164926b, cls, C47810es.m84966f(sVar), executor));
    }

    /* renamed from: h */
    public final C47633f mo51515h(C58817ah ahVar, Executor executor) {
        return new C47633f(C60922j.m93044g(this.f164926b, C47810es.m84963c(ahVar), executor));
    }

    /* renamed from: i */
    public final C47633f mo51516i(C60931s sVar, Executor executor) {
        return new C47633f(C60922j.m93045h(this.f164926b, C47810es.m84966f(sVar), executor));
    }

    /* renamed from: j */
    public final C47633f mo51517j(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return new C47633f(C60856cj.m92908q(this.f164926b, j, timeUnit, scheduledExecutorService));
    }
}
