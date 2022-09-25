package com.google.android.libraries.performance.primes.metrics.p2404b;

import com.google.android.libraries.performance.primes.p2397b.C31178h;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.a */
/* compiled from: PG */
public final class C31295a extends C31301d {

    /* renamed from: a */
    public String f84268a;

    /* renamed from: b */
    public C71308ej f84269b;

    /* renamed from: c */
    public C71207aq f84270c;

    /* renamed from: d */
    public String f84271d;

    /* renamed from: e */
    public Long f84272e;

    /* renamed from: f */
    public C31178h f84273f;

    /* renamed from: g */
    private boolean f84274g;

    /* renamed from: h */
    private boolean f84275h;

    /* renamed from: i */
    private int f84276i;

    /* renamed from: j */
    private byte f84277j;

    /* renamed from: a */
    public final C31302e mo37000a() {
        C71308ej ejVar;
        if (this.f84277j == 7 && (ejVar = this.f84269b) != null) {
            return new C31299b(this.f84268a, this.f84274g, ejVar, this.f84270c, this.f84271d, this.f84272e, this.f84275h, this.f84273f, this.f84276i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f84277j & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.f84269b == null) {
            sb.append(" metric");
        }
        if ((this.f84277j & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.f84277j & 4) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo37001b(int i) {
        this.f84276i = i;
        this.f84277j = (byte) (this.f84277j | 4);
    }

    /* renamed from: c */
    public final void mo37002c(boolean z) {
        this.f84274g = z;
        this.f84277j = (byte) (this.f84277j | 1);
    }

    /* renamed from: d */
    public final void mo37003d(boolean z) {
        this.f84275h = z;
        this.f84277j = (byte) (this.f84277j | 2);
    }

    /* renamed from: e */
    public final void mo37004e(C71308ej ejVar) {
        if (ejVar != null) {
            this.f84269b = ejVar;
            return;
        }
        throw new NullPointerException("Null metric");
    }
}
