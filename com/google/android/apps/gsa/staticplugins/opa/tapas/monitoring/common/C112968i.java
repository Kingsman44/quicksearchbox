package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112975j;
import com.google.common.p4580v.C60948g;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.i */
/* compiled from: PG */
public final class C112968i {

    /* renamed from: a */
    public static final ThreadLocal f313043a = new ThreadLocal();

    /* renamed from: b */
    private static final Instant f313044b = Instant.now();

    /* renamed from: c */
    private static final long f313045c = System.nanoTime();

    /* renamed from: d */
    private static Instant f313046d = m186958b();

    static {
        C60948g gVar = C60948g.f165068a;
    }

    /* renamed from: a */
    public static C112966g m186957a() {
        for (C112975j jVar : C112964e.f313040a) {
        }
        return new C112966g();
    }

    /* renamed from: b */
    private static synchronized Instant m186958b() {
        Instant ofEpochSecond;
        synchronized (C112968i.class) {
            Instant instant = f313044b;
            ofEpochSecond = Instant.ofEpochSecond(instant.getEpochSecond(), (((long) instant.getNano()) + System.nanoTime()) - f313045c);
            Instant instant2 = f313046d;
            if (instant2 != null && !instant2.isBefore(ofEpochSecond)) {
                ofEpochSecond = f313046d.plusNanos(1);
            }
            f313046d = ofEpochSecond;
        }
        return ofEpochSecond;
    }
}
