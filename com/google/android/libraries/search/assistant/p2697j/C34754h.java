package com.google.android.libraries.search.assistant.p2697j;

import com.google.android.libraries.p1730f.C21370a;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.j.h */
/* compiled from: PG */
final class C34754h extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Instant f92222a;

    /* renamed from: b */
    final /* synthetic */ C21370a f92223b;

    /* renamed from: c */
    final /* synthetic */ C69626l f92224c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34754h(Instant instant, C21370a aVar, C69626l lVar) {
        super(0);
        this.f92222a = instant;
        this.f92223b = aVar;
        this.f92224c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Duration between = Duration.between(this.f92222a, C34756j.m63507a(this.f92223b));
        C69626l lVar = this.f92224c;
        C69664n.m101060f(between, "duration");
        lVar.mo5761a(between);
        return C69788q.f186170a;
    }
}
