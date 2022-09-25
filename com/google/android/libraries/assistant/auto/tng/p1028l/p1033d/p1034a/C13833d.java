package com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.d.a.d */
/* compiled from: PG */
public final class C13833d extends C13837h {

    /* renamed from: a */
    public C13840k f42129a;

    /* renamed from: b */
    private long f42130b;

    /* renamed from: c */
    private byte f42131c;

    /* renamed from: a */
    public final C13838i mo21284a() {
        C13840k kVar;
        if (this.f42131c == 1 && (kVar = this.f42129a) != null) {
            return new C13834e(kVar, this.f42130b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f42129a == null) {
            sb.append(" fetchRequestParams");
        }
        if (this.f42131c == 0) {
            sb.append(" creationTimeMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo21285b(long j) {
        this.f42130b = j;
        this.f42131c = 1;
    }
}
