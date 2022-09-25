package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10448e;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.e.d */
/* compiled from: PG */
public final class C137984d {

    /* renamed from: a */
    public final C42876ab f375403a;

    /* renamed from: b */
    private final C60950i f375404b;

    /* renamed from: c */
    private final long f375405c;

    public C137984d(C42876ab abVar, C60950i iVar, long j) {
        this.f375403a = abVar;
        this.f375404b = iVar;
        this.f375405c = j;
    }

    /* renamed from: a */
    public final C60870cx mo114069a() {
        C60870cx b = mo114070b(false);
        C137983c cVar = new C137983c(this);
        return C60922j.m93045h(b, C47810es.m84966f(cVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo114070b(boolean z) {
        Instant a = this.f375404b.mo57444a();
        return this.f375403a.mo46039a(new C137981a(a.minus(Duration.ofDays(this.f375405c)), z, a), C60826bg.f164896a);
    }
}
