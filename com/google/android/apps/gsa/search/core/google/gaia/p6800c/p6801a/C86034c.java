package com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a;

import com.google.android.libraries.search.p2476a.p2479c.C32204e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.c.a.c */
/* compiled from: PG */
public final class C86034c {

    /* renamed from: a */
    private final C68214a f232601a;

    /* renamed from: b */
    private final C32204e f232602b;

    /* renamed from: c */
    private final Executor f232603c;

    public C86034c(C68214a aVar, C32204e eVar, Executor executor) {
        this.f232601a = aVar;
        this.f232602b = eVar;
        this.f232603c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo79696a() {
        return C47633f.m84733g(mo79697b()).mo51515h(C86032a.f232599a, this.f232603c);
    }

    /* renamed from: b */
    public final C60870cx mo79697b() {
        C47633f g = C47633f.m84733g(((C86036e) this.f232601a.mo27525b()).mo79654A());
        C32204e eVar = this.f232602b;
        Objects.requireNonNull(eVar);
        return g.mo51516i(new C86033b(eVar), this.f232603c);
    }
}
