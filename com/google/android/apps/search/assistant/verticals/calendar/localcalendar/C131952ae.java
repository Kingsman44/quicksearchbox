package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.p10905k.C146602a;
import com.google.apps.tiktok.account.data.device.C46201e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ae */
/* compiled from: PG */
public final class C131952ae {

    /* renamed from: a */
    private final C46201e f360275a;

    /* renamed from: b */
    private final Executor f360276b;

    public C131952ae(C46201e eVar, Executor executor) {
        this.f360275a = eVar;
        this.f360276b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo110356a() {
        C60870cx a = this.f360275a.mo50258a(new C131950ac(C146602a.m238836a("HOSTED")));
        C131951ad adVar = C131951ad.f360274a;
        return C60922j.m93044g(a, C47810es.m84963c(adVar), this.f360276b);
    }
}
