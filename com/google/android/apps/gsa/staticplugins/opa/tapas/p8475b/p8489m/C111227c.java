package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8489m;

import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.m.c */
/* compiled from: PG */
public final class C111227c extends C112473ar {

    /* renamed from: a */
    public final C21370a f309532a;

    /* renamed from: b */
    private final C74637ae f309533b;

    /* renamed from: c */
    private final C113425ff f309534c;

    /* renamed from: d */
    private final Executor f309535d;

    public C111227c(C74637ae aeVar, C21370a aVar, C113425ff ffVar, Executor executor) {
        this.f309533b = aeVar;
        this.f309532a = aVar;
        this.f309534c = ffVar;
        this.f309535d = executor;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return TimeUnit.MINUTES.toMillis(15);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        long b = this.f309532a.mo26870b();
        if (!this.f309534c.mo100141g()) {
            return m186307l(this.f309532a);
        }
        C74637ae aeVar = this.f309533b;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_ASSISTANT_TAPAS);
        d.mo41493b(Duration.ofDays(1));
        C60870cx c = aeVar.mo71020c(d.mo41492a());
        C111226b bVar = new C111226b(this, b);
        return C60922j.m93045h(c, C47810es.m84966f(bVar), this.f309535d);
    }

    /* renamed from: m */
    public final long mo99046m() {
        return TimeUnit.MINUTES.toMillis(15);
    }
}
