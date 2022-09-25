package com.google.android.apps.gsa.shared.p6968aa;

/* renamed from: com.google.android.apps.gsa.shared.aa.b */
/* compiled from: PG */
final class C89029b extends C89064t {

    /* renamed from: a */
    public C89065u f241295a;

    /* renamed from: b */
    public long f241296b;

    /* renamed from: c */
    public byte f241297c;

    /* renamed from: d */
    public int f241298d;

    /* renamed from: a */
    public final C89066v mo83005a() {
        if (this.f241297c == 1 && this.f241298d != 0 && this.f241295a != null) {
            return new C89047c(this.f241298d, this.f241295a, this.f241296b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f241298d == 0) {
            sb.append(" networkLevel");
        }
        if (this.f241295a == null) {
            sb.append(" networkQuality");
        }
        if (this.f241297c == 0) {
            sb.append(" connectivityProgressWaitingTimeoutMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
