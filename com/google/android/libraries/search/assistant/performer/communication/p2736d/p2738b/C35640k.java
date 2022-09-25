package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35648i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.b.k */
/* compiled from: PG */
public final class C35640k implements C35648i, C35608aa {

    /* renamed from: a */
    public C60870cx f93499a = C60856cj.m92899h(new IllegalStateException("Notifications have not been set"));

    /* renamed from: b */
    private final Executor f93500b;

    public C35640k(Executor executor) {
        this.f93500b = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20795a() {
        C35639j jVar = new C35639j(this);
        return C60856cj.m92905n(C47810es.m84965e(jVar), this.f93500b);
    }

    /* renamed from: b */
    public final C60870cx mo21082b(C60870cx cxVar) {
        C35638i iVar = new C35638i(this, cxVar);
        return C60856cj.m92904m(C47810es.m84978r(iVar), this.f93500b);
    }

    /* renamed from: c */
    public final C60870cx mo21083c(List list) {
        return mo21082b(C60856cj.m92900i(list));
    }
}
