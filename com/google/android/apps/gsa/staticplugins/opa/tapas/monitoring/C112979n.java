package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EnumMap;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.n */
/* compiled from: PG */
final class C112979n {

    /* renamed from: a */
    final long f313085a;

    /* renamed from: b */
    final String f313086b;

    /* renamed from: c */
    final Deque f313087c;

    /* renamed from: d */
    final EnumMap f313088d;

    /* renamed from: e */
    final C112973h f313089e;

    /* renamed from: f */
    C112976k f313090f;

    /* renamed from: g */
    Instant f313091g;

    /* renamed from: h */
    boolean f313092h = false;

    public C112979n(long j, String str, Instant instant) {
        this.f313085a = j;
        this.f313086b = str;
        this.f313087c = new ArrayDeque(20);
        this.f313088d = new EnumMap(C112976k.class);
        this.f313091g = instant;
        this.f313090f = C112976k.UNKNOWN;
        this.f313089e = new C112973h(instant);
    }
}
