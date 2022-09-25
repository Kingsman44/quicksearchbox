package org.chromium.base;

import java.util.concurrent.atomic.AtomicBoolean;
import p000J.C0000N;

/* compiled from: PG */
public class TraceEvent implements AutoCloseable {

    /* renamed from: a */
    public static volatile boolean f192510a;

    /* renamed from: b */
    public static AtomicBoolean f192511b = new AtomicBoolean();

    /* renamed from: c */
    public static boolean f192512c;

    /* renamed from: d */
    public final String f192513d;

    static {
        new AtomicBoolean();
    }

    private TraceEvent(String str) {
        this.f192513d = str;
        m107030a(str, (String) null);
    }

    /* renamed from: a */
    public static void m107030a(String str, String str2) {
        int i = EarlyTraceEvent.f192491a;
        if (f192510a) {
            C0000N.M9XfPu17(str, str2);
        }
    }

    /* renamed from: b */
    public static void m107031b(String str, long j) {
        int i = EarlyTraceEvent.f192491a;
        if (f192510a) {
            C0000N.Mw73xTww(str, (String) null, j);
        }
    }

    /* renamed from: c */
    public static TraceEvent m107032c(String str) {
        int i = EarlyTraceEvent.f192491a;
        if (!f192510a) {
            return null;
        }
        return new TraceEvent(str);
    }

    public static void dumpViewHierarchy(long j, Object obj) {
        synchronized (ApplicationStatus.f192472a) {
        }
    }

    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.f192492b) {
                int i = EarlyTraceEvent.f192491a;
            }
        }
        if (f192510a != z) {
            f192510a = z;
            ThreadUtils.m107028a().getLooper().setMessageLogging(z ? C72412y.f192593a : null);
        }
        if (f192511b.get()) {
            C72370aa.m107034a();
        }
    }

    public static void setEventNameFilteringEnabled(boolean z) {
        f192512c = z;
    }

    public final void close() {
        m107031b(this.f192513d, 0);
    }
}
