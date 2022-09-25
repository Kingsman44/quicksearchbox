package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ce */
/* compiled from: PG */
final class C82357ce extends C82586kr {

    /* renamed from: a */
    public String f224988a;

    /* renamed from: b */
    private int f224989b;

    /* renamed from: c */
    private byte f224990c;

    /* renamed from: a */
    public final C82587ks mo75850a() {
        String str;
        if (this.f224990c == 1 && (str = this.f224988a) != null) {
            return new C82358cf(str, this.f224989b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224988a == null) {
            sb.append(" token");
        }
        if (this.f224990c == 0) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75851b(int i) {
        this.f224989b = i;
        this.f224990c = 1;
    }
}
