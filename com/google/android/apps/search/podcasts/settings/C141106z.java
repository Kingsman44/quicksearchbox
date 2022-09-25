package com.google.android.apps.search.podcasts.settings;

import com.google.android.apps.search.podcasts.settings.p10612a.C141057j;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.z */
/* compiled from: PG */
final class C141106z implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C141098t f383095a;

    public C141106z(C141098t tVar) {
        this.f383095a = tVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Duration duration = (Duration) obj;
        C69664n.m101061g(duration, "duration");
        C141057j jVar = this.f383095a.f383072e;
        C69664n.m101061g(duration, "timeToRemoveCompletedEpisode");
        C60870cx h = jVar.f382964a.mo115683h(duration);
        C69664n.m101060f(h, "preferencesManager.setTi…ToRemoveCompletedEpisode)");
        jVar.mo116115b(h);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
