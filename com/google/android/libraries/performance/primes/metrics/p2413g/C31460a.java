package com.google.android.libraries.performance.primes.metrics.p2413g;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.performance.primes.metrics.g.a */
/* compiled from: PG */
public final class C31460a extends C31462c {

    /* renamed from: a */
    public C58485gu f84723a;

    /* renamed from: b */
    public int f84724b;

    /* renamed from: c */
    private int f84725c;

    /* renamed from: d */
    private int f84726d;

    /* renamed from: e */
    private int f84727e;

    /* renamed from: f */
    private int f84728f;

    /* renamed from: g */
    private byte f84729g;

    /* renamed from: a */
    public final C31463d mo37148a() {
        C58485gu guVar;
        int i;
        if (this.f84729g == 15 && (guVar = this.f84723a) != null && (i = this.f84724b) != 0) {
            return new C31461b(this.f84725c, this.f84726d, this.f84727e, this.f84728f, guVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f84729g & 1) == 0) {
            sb.append(" initialMonitoringDelayMs");
        }
        if ((this.f84729g & 2) == 0) {
            sb.append(" checkForResponseIntervalMs");
        }
        if ((this.f84729g & 4) == 0) {
            sb.append(" midStallCheckForResponseIntervalMs");
        }
        if ((this.f84729g & 8) == 0) {
            sb.append(" postToMainIntervalMs");
        }
        if (this.f84723a == null) {
            sb.append(" stallThresholdsMs");
        }
        if (this.f84724b == 0) {
            sb.append(" enablement");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo37149b(int i) {
        this.f84726d = i;
        this.f84729g = (byte) (this.f84729g | 2);
    }

    /* renamed from: c */
    public final void mo37150c(int i) {
        this.f84725c = i;
        this.f84729g = (byte) (this.f84729g | 1);
    }

    /* renamed from: d */
    public final void mo37151d(int i) {
        this.f84727e = i;
        this.f84729g = (byte) (this.f84729g | 4);
    }

    /* renamed from: e */
    public final void mo37152e(int i) {
        this.f84728f = i;
        this.f84729g = (byte) (this.f84729g | 8);
    }
}
