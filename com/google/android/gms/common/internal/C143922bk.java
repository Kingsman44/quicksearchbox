package com.google.android.gms.common.internal;

/* renamed from: com.google.android.gms.common.internal.bk */
/* compiled from: PG */
public final class C143922bk {

    /* renamed from: b */
    private static C143922bk f390113b;

    /* renamed from: c */
    private static final RootTelemetryConfiguration f390114c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a */
    public RootTelemetryConfiguration f390115a;

    private C143922bk() {
    }

    /* renamed from: a */
    public static synchronized C143922bk m233972a() {
        C143922bk bkVar;
        synchronized (C143922bk.class) {
            if (f390113b == null) {
                f390113b = new C143922bk();
            }
            bkVar = f390113b;
        }
        return bkVar;
    }

    /* renamed from: b */
    public final synchronized void mo119430b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f390115a = f390114c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f390115a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f390046a < rootTelemetryConfiguration.f390046a) {
            this.f390115a = rootTelemetryConfiguration;
        }
    }
}
