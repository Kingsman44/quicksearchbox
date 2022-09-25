package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.e */
/* compiled from: PG */
public final class C127071e {

    /* renamed from: a */
    private static final C59071e f349895a = C59071e.m91331h();

    /* renamed from: b */
    private final C71422aw f349896b;

    public C127071e(C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f349896b = awVar;
    }

    /* renamed from: a */
    public final C127070d mo107921a(Duration duration, C69615a aVar) {
        C69664n.m101061g(duration, "duration");
        C59052c cVar = (C59052c) f349895a.mo56224b();
        cVar.mo56379ah(new C59094n(37370));
        cVar.mo56389s("Creating the timer for %d seconds.", duration);
        return new C127070d(duration, aVar, this.f349896b);
    }
}
