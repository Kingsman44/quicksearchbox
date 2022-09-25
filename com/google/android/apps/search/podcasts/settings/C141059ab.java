package com.google.android.apps.search.podcasts.settings;

import com.google.android.apps.search.podcasts.settings.p10612a.C141057j;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.settings.ab */
/* compiled from: PG */
final class C141059ab implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C141098t f382974a;

    public C141059ab(C141098t tVar) {
        this.f382974a = tVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Duration duration = (Duration) obj;
        C69664n.m101061g(duration, "duration");
        C141057j jVar = this.f382974a.f383072e;
        C69664n.m101061g(duration, "timeToRemoveUnfinishedEpisode");
        C60870cx i = jVar.f382964a.mo115684i(duration);
        C69664n.m101060f(i, "preferencesManager.setTi…oRemoveUnfinishedEpisode)");
        jVar.mo116115b(i);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
