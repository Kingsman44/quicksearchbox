package org.chromium.base;

/* compiled from: PG */
public class EarlyTraceEvent {

    /* renamed from: a */
    static volatile int f192491a;

    /* renamed from: b */
    static final Object f192492b = new Object();

    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        C72381g.f192526a.edit().putBoolean("bg_startup_tracing", z).apply();
    }
}
