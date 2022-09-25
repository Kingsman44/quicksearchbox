package com.google.apps.tiktok.cache;

/* renamed from: com.google.apps.tiktok.cache.b */
/* compiled from: PG */
final class C46387b extends C46395j {

    /* renamed from: a */
    public long f121418a;

    /* renamed from: b */
    public byte f121419b;

    /* renamed from: c */
    private int f121420c;

    /* renamed from: a */
    public final C46396k mo50350a() {
        if (this.f121419b == 3) {
            return new C46388c(this.f121420c, this.f121418a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f121419b & 1) == 0) {
            sb.append(" maxSizeBytes");
        }
        if ((this.f121419b & 2) == 0) {
            sb.append(" filterAfterWriteMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo50351b(int i) {
        this.f121420c = i;
        this.f121419b = (byte) (this.f121419b | 1);
    }
}
