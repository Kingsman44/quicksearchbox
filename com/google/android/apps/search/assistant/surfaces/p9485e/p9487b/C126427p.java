package com.google.android.apps.search.assistant.surfaces.p9485e.p9487b;

import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b.p */
/* compiled from: PG */
final class C126427p extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C69648ae f348200a;

    /* renamed from: b */
    final /* synthetic */ C126430s f348201b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126427p(C69648ae aeVar, C126430s sVar) {
        super(1);
        this.f348200a = aeVar;
        this.f348201b = sVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Duration duration = (Duration) obj;
        C69664n.m101061g(duration, "it");
        return Boolean.valueOf(duration.minus((Duration) this.f348200a.f186027a).compareTo(this.f348201b.f348211a.f348168a) > 0);
    }
}
