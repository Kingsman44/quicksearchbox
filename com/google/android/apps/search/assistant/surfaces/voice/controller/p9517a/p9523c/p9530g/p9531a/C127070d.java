package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71552db;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.d */
/* compiled from: PG */
public final class C127070d implements Closeable {

    /* renamed from: a */
    private final C71643cp f349894a;

    public C127070d(Duration duration, C69615a aVar, C71422aw awVar) {
        C69664n.m101061g(duration, "duration");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f349894a = C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C127068b(new C71552db(new C127069c(duration, (C69577g) null)), aVar, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final void mo107919a() {
        this.f349894a.mo62723u((CancellationException) null);
    }

    public final void close() {
        mo107919a();
    }
}
