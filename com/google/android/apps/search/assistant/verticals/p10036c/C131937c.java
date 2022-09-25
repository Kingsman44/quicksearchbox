package com.google.android.apps.search.assistant.verticals.p10036c;

import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.libraries.geller.p1816d.C21771c;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.c.c */
/* compiled from: PG */
public final class C131937c implements C21771c {

    /* renamed from: a */
    public final C38469m f360244a;

    /* renamed from: b */
    public final Executor f360245b;

    /* renamed from: c */
    private final C121011a f360246c;

    public C131937c(C38469m mVar, C121011a aVar, Executor executor) {
        this.f360244a = mVar;
        this.f360246c = aVar;
        this.f360245b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo27105a() {
        C60870cx a = this.f360246c.mo104231a();
        C60870cx b = this.f360246c.mo104232b();
        return C47636i.m84746e(a, b).mo51519b(new C131935a(this, a, b), this.f360245b);
    }

    /* renamed from: b */
    public final C65753ak mo27106b() {
        return C65753ak.LAUNCHER_DEEPLINKS;
    }
}
