package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.h */
/* compiled from: PG */
final class C112973h {

    /* renamed from: a */
    final Instant f313054a;

    /* renamed from: b */
    Instant f313055b = null;

    /* renamed from: c */
    final List f313056c = new ArrayList(50);

    /* renamed from: d */
    final List f313057d = new ArrayList(50);

    /* renamed from: e */
    final Map f313058e = new EnumMap(C112976k.class);

    public C112973h(Instant instant) {
        this.f313054a = instant;
    }

    /* renamed from: a */
    public final synchronized void mo99796a(C112976k kVar, Duration duration) {
        this.f313056c.add(new C112978m(kVar, duration));
    }

    /* renamed from: b */
    public final synchronized void mo99797b(C112976k kVar, C112976k kVar2, Duration duration) {
        this.f313057d.add(new C112981p(kVar, kVar2, duration));
    }

    /* renamed from: c */
    public final synchronized void mo99798c(C112976k kVar, String str) {
        this.f313058e.put(kVar, str);
    }

    /* renamed from: d */
    public final synchronized void mo99799d(Instant instant) {
        this.f313055b = instant;
    }
}
