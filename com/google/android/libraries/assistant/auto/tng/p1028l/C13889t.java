package com.google.android.libraries.assistant.auto.tng.p1028l;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.t */
/* compiled from: PG */
public final class C13889t {

    /* renamed from: a */
    public final C60870cx f42305a;

    /* renamed from: b */
    public final String f42306b = "policy level timeout";

    /* renamed from: c */
    public final C60870cx f42307c;

    /* renamed from: d */
    public C2164c f42308d;

    /* renamed from: e */
    private final Duration f42309e;

    /* renamed from: f */
    private final C60888db f42310f;

    /* renamed from: g */
    private C60870cx f42311g;

    public C13889t(C60870cx cxVar, Duration duration, C60888db dbVar) {
        this.f42309e = duration;
        this.f42310f = dbVar;
        this.f42307c = cxVar;
        this.f42305a = C2169h.m6027a(new C13886q(this));
        C13888s sVar = new C13888s(this, cxVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(sVar), C60826bg.f164896a);
        C2164c cVar = this.f42308d;
        cVar.getClass();
        cVar.mo5436a(new C13887r(this, cxVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo21339a() {
        C60870cx cxVar = this.f42311g;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* renamed from: b */
    public final void mo21340b() {
        if (this.f42311g == null && !this.f42309e.isNegative()) {
            this.f42311g = this.f42310f.mo29165e(new C13885p(this), this.f42309e.toNanos(), TimeUnit.NANOSECONDS);
        }
    }
}
