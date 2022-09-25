package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.ai */
/* compiled from: PG */
public final class C40269ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C40272al f105777a;

    /* renamed from: b */
    final /* synthetic */ Instant f105778b;

    public C40269ai(C40272al alVar, Instant instant) {
        this.f105777a = alVar;
        this.f105778b = instant;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C40272al alVar = this.f105777a;
        C40267ag agVar = C40267ag.REUSED;
        Duration between = Duration.between(this.f105778b, this.f105777a.f105788e.mo57444a());
        C69664n.m101060f(between, "between(startTime, timeSource.now())");
        alVar.mo42369b(agVar.f105770h, between);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C40272al alVar = this.f105777a;
        C40267ag agVar = C40267ag.REUSED;
        Duration between = Duration.between(this.f105778b, this.f105777a.f105788e.mo57444a());
        C69664n.m101060f(between, "between(startTime, timeSource.now())");
        alVar.mo42369b(agVar.f105769g, between);
    }
}
