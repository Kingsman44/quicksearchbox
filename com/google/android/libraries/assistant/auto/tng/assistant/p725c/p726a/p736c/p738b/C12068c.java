package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c.p738b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.C12036c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.b.c */
/* compiled from: PG */
public final class C12068c implements C12036c {

    /* renamed from: a */
    private final C60870cx f38629a;

    /* renamed from: b */
    private final Executor f38630b;

    public C12068c(C60870cx cxVar, Executor executor) {
        this.f38629a = cxVar;
        this.f38630b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20381a() {
        C60870cx cxVar = this.f38629a;
        C12067b bVar = C12067b.f38628a;
        return C60922j.m93045h(cxVar, C47810es.m84966f(bVar), this.f38630b);
    }

    /* renamed from: b */
    public final C60870cx mo20382b() {
        this.f38629a.cancel(false);
        C60870cx cxVar = this.f38629a;
        C12066a aVar = C12066a.f38627a;
        return C60922j.m93045h(cxVar, C47810es.m84966f(aVar), this.f38630b);
    }
}
