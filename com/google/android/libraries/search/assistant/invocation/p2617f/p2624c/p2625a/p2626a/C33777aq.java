package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a.C120082b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.aq */
/* compiled from: PG */
public final class C33777aq {

    /* renamed from: a */
    public static final C59071e f90224a = C59071e.m91331h();

    /* renamed from: b */
    public final C21370a f90225b;

    /* renamed from: c */
    public final Duration f90226c;

    /* renamed from: d */
    public Duration f90227d;

    /* renamed from: e */
    public final C120082b f90228e;

    public C33777aq(C21370a aVar, C120082b bVar, C62910ar arVar) {
        C69664n.m101061g(aVar, "clock");
        this.f90225b = aVar;
        this.f90228e = bVar;
        Duration d = C62950b.m95473d(arVar);
        C69664n.m101060f(d, "toJavaDuration(systemInvocationThresholdDuration)");
        this.f90226c = d;
        Duration ofMillis = Duration.ofMillis(Long.MIN_VALUE);
        C69664n.m101060f(ofMillis, "ofMillis(Long.MIN_VALUE)");
        this.f90227d = ofMillis;
    }
}
