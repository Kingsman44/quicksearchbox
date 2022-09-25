package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ak */
/* compiled from: PG */
public final class C82309ak extends C82537iw {

    /* renamed from: a */
    public String f224831a;

    /* renamed from: b */
    public Double f224832b;

    /* renamed from: c */
    private int f224833c;

    /* renamed from: d */
    private boolean f224834d;

    /* renamed from: e */
    private byte f224835e;

    /* renamed from: a */
    public final C82538ix mo75631a() {
        String str;
        Double d;
        if (this.f224835e == 3 && (str = this.f224831a) != null && (d = this.f224832b) != null) {
            return new C82310al(str, d, this.f224833c, this.f224834d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224831a == null) {
            sb.append(" token");
        }
        if (this.f224832b == null) {
            sb.append(" value");
        }
        if ((this.f224835e & 1) == 0) {
            sb.append(" contextType");
        }
        if ((this.f224835e & 2) == 0) {
            sb.append(" isOutOfDate");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75632b(int i) {
        this.f224833c = i;
        this.f224835e = (byte) (this.f224835e | 1);
    }

    /* renamed from: c */
    public final void mo75633c(boolean z) {
        this.f224834d = z;
        this.f224835e = (byte) (this.f224835e | 2);
    }
}
