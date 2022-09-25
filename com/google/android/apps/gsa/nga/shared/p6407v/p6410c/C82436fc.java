package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fc */
/* compiled from: PG */
public final class C82436fc extends C82665np {

    /* renamed from: a */
    public String f225244a;

    /* renamed from: b */
    public String f225245b;

    /* renamed from: c */
    private int f225246c;

    /* renamed from: d */
    private byte f225247d;

    /* renamed from: a */
    public final C82666nq mo76214a() {
        String str;
        String str2;
        if (this.f225247d == 1 && (str = this.f225244a) != null && (str2 = this.f225245b) != null) {
            return new C82437fd(str, this.f225246c, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225244a == null) {
            sb.append(" token");
        }
        if (this.f225247d == 0) {
            sb.append(" errorCode");
        }
        if (this.f225245b == null) {
            sb.append(" exceptionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76215b(int i) {
        this.f225246c = i;
        this.f225247d = 1;
    }
}
