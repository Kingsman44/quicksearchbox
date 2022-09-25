package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aeq;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.y */
/* compiled from: PG */
public final class C35664y {

    /* renamed from: a */
    public static final C59071e f93541a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.d.y");

    /* renamed from: b */
    private final ScheduledExecutorService f93542b;

    public C35664y(ScheduledExecutorService scheduledExecutorService) {
        this.f93542b = scheduledExecutorService;
    }

    /* renamed from: b */
    private final C60870cx m64063b(C60870cx cxVar, boolean z) {
        C35660u uVar = new C35660u(z);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(uVar), this.f93542b);
        C35661v vVar = new C35661v(z);
        return C60846c.m92878g(g, Throwable.class, C47810es.m84963c(vVar), this.f93542b);
    }

    /* renamed from: a */
    public final C60870cx mo39783a(C35663x xVar) {
        aeq c = xVar.mo39772c();
        if ((c.f134949a & 1) == 0) {
            return m64063b(C60856cj.m92899h(new C35471g("Missing mark as read index")), c.f134953e);
        }
        C60870cx a = xVar.mo39771b().mo39738a();
        C35658s sVar = new C35658s(c);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(sVar), this.f93542b);
        C35659t tVar = new C35659t(xVar, c);
        return m64063b(C60856cj.m92908q(C60922j.m93045h(h, C47810es.m84966f(tVar), this.f93542b), 6, TimeUnit.SECONDS, this.f93542b), c.f134953e);
    }
}
