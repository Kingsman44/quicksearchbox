package com.google.android.apps.search.podcasts.player.impl;

import com.google.android.apps.search.podcasts.player.C140788f;
import com.google.android.apps.search.podcasts.player.C140789g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.ah */
/* compiled from: PG */
final class C140800ah implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382317a;

    /* renamed from: b */
    final /* synthetic */ Duration f382318b;

    /* renamed from: c */
    final /* synthetic */ C140789g f382319c;

    public C140800ah(C140806an anVar, Duration duration, C140789g gVar) {
        this.f382317a = anVar;
        this.f382318b = duration;
        this.f382319c = gVar;
    }

    public final void run() {
        Instant plus = Instant.ofEpochMilli(this.f382317a.f382372j.mo26870b()).plus(this.f382318b);
        C140806an anVar = this.f382317a;
        C140789g gVar = this.f382319c;
        C69664n.m101060f(plus, "timerEnd");
        anVar.f382331F = new C140788f(gVar, plus);
        C60870cx cxVar = this.f382317a.f382332G;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        if (this.f382319c == C140789g.END_OF_TIME) {
            C140806an anVar2 = this.f382317a;
            C140799ag agVar = new C140799ag(anVar2);
            anVar2.f382332G = C60856cj.m92902k(C47810es.m84965e(agVar), this.f382318b.getSeconds(), TimeUnit.SECONDS, this.f382317a.f382371i);
        } else {
            this.f382317a.f382332G = null;
        }
        this.f382317a.mo115919x(false);
    }
}
