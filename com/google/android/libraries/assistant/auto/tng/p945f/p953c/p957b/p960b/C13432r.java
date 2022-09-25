package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35608aa;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35648i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.r */
/* compiled from: PG */
public final class C13432r implements C35648i, C35608aa {

    /* renamed from: a */
    public C60870cx f41259a = C60856cj.m92899h(new IllegalStateException("Notifications have not been set"));

    /* renamed from: b */
    private final Executor f41260b;

    public C13432r(Executor executor) {
        this.f41260b = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20795a() {
        C13430p pVar = new C13430p(this);
        return C60856cj.m92905n(C47810es.m84965e(pVar), this.f41260b);
    }

    /* renamed from: b */
    public final C60870cx mo21082b(C60870cx cxVar) {
        C13431q qVar = new C13431q(this, cxVar);
        return C60856cj.m92904m(C47810es.m84978r(qVar), this.f41260b);
    }

    /* renamed from: c */
    public final C60870cx mo21083c(List list) {
        return mo21082b(C60856cj.m92900i(list));
    }
}
