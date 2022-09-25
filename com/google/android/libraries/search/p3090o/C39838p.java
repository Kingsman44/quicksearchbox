package com.google.android.libraries.search.p3090o;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.p3648i.p3650b.C47162f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.o.p */
/* compiled from: PG */
public final class C39838p {

    /* renamed from: a */
    public static final C59071e f104740a = C59071e.m91332i("com.google.android.libraries.search.o.p");

    /* renamed from: b */
    public final C42876ab f104741b;

    /* renamed from: c */
    public final C47162f f104742c;

    /* renamed from: d */
    public final Executor f104743d;

    /* renamed from: e */
    public final C21370a f104744e;

    /* renamed from: f */
    private final C60888db f104745f;

    /* renamed from: g */
    private final C46778cv f104746g;

    /* renamed from: h */
    private final Duration f104747h;

    public C39838p(C60888db dbVar, C42876ab abVar, Duration duration, Executor executor, C47162f fVar, C46778cv cvVar, C21370a aVar) {
        this.f104745f = dbVar;
        this.f104741b = abVar;
        this.f104747h = duration;
        this.f104743d = executor;
        this.f104742c = fVar;
        this.f104746g = cvVar;
        this.f104744e = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo42021a() {
        C39832j jVar = new C39832j(this);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(jVar), this.f104743d)).mo51517j(5, TimeUnit.SECONDS, this.f104745f).mo51514f(Throwable.class, new C39833k(this), this.f104743d);
    }

    /* renamed from: b */
    public final C60870cx mo42022b(C56016b bVar) {
        C60870cx a = this.f104741b.mo46039a(new C39834l(bVar), C60826bg.f164896a);
        this.f104746g.mo50787a(a, "TEMPERATURE_UNIT_DATA_SOURCE_KEY");
        return a;
    }

    /* renamed from: c */
    public final boolean mo42023c(Duration duration) {
        return duration.isZero() || Duration.ofMillis(this.f104744e.mo26870b()).minus(duration).compareTo(this.f104747h) >= 0;
    }
}
