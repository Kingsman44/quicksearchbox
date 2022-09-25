package com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a;

import p3186j$.time.Duration;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.e.b.a.j */
/* compiled from: PG */
final class C32585j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C69648ae f87266a;

    /* renamed from: b */
    final /* synthetic */ C32587l f87267b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32585j(C69648ae aeVar, C32587l lVar) {
        super(1);
        this.f87266a = aeVar;
        this.f87267b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Duration duration = (Duration) obj;
        C69664n.m101061g(duration, "it");
        return Boolean.valueOf(duration.minus((Duration) this.f87266a.f186027a).compareTo(this.f87267b.f87278a.f87238c) >= 0);
    }
}
