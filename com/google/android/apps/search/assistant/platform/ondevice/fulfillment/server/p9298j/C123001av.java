package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122416bh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.av */
/* compiled from: PG */
public final class C123001av {

    /* renamed from: a */
    public final C58889cz f340547a;

    /* renamed from: b */
    private final ArrayList f340548b = new ArrayList();

    public C123001av(C58889cz czVar) {
        this.f340547a = czVar;
    }

    /* renamed from: e */
    private final C60870cx m202332e(int i, C60870cx cxVar, long j) {
        C123000au auVar = new C123000au(this, i, j);
        return C60922j.m93044g(cxVar, C47810es.m84963c(auVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final synchronized C58485gu mo105818a() {
        return C58485gu.m89842j(this.f340548b);
    }

    /* renamed from: b */
    public final synchronized void mo105819b(C122416bh bhVar) {
        this.f340548b.add(bhVar);
    }

    /* renamed from: c */
    public final C60870cx mo105820c(int i, C60930r rVar) {
        return m202332e(i, C60856cj.m92905n(C47810es.m84965e(rVar), C60826bg.f164896a), this.f340547a.mo26884a());
    }

    /* renamed from: d */
    public final C60870cx mo105821d(int i, C60870cx cxVar) {
        return m202332e(i, cxVar, this.f340547a.mo26884a());
    }
}
