package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.b */
/* compiled from: PG */
final class C131130b {

    /* renamed from: a */
    private int f358625a;

    /* renamed from: b */
    private int f358626b;

    /* renamed from: c */
    private byte f358627c;

    /* renamed from: a */
    public final C131141m mo110090a() {
        if (this.f358627c == 3) {
            return new C131131c(this.f358625a, this.f358626b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f358627c & 1) == 0) {
            sb.append(" offset");
        }
        if ((this.f358627c & 2) == 0) {
            sb.append(" end");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo110091b(int i) {
        this.f358626b = i;
        this.f358627c = (byte) (this.f358627c | 2);
    }

    /* renamed from: c */
    public final void mo110092c(int i) {
        this.f358625a = i;
        this.f358627c = (byte) (this.f358627c | 1);
    }
}
