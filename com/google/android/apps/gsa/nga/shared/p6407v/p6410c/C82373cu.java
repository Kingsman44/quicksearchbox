package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cu */
/* compiled from: PG */
public final class C82373cu extends C82603lh {

    /* renamed from: a */
    public String f225038a;

    /* renamed from: b */
    public Double f225039b;

    /* renamed from: c */
    public String f225040c;

    /* renamed from: d */
    private boolean f225041d;

    /* renamed from: e */
    private byte f225042e;

    /* renamed from: a */
    public final C82604li mo75914a() {
        String str;
        Double d;
        String str2;
        if (this.f225042e == 1 && (str = this.f225038a) != null && (d = this.f225039b) != null && (str2 = this.f225040c) != null) {
            return new C82374cv(str, d, str2, this.f225041d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225038a == null) {
            sb.append(" token");
        }
        if (this.f225039b == null) {
            sb.append(" value");
        }
        if (this.f225040c == null) {
            sb.append(" button");
        }
        if (this.f225042e == 0) {
            sb.append(" attemptedBugFix");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75915b(boolean z) {
        this.f225041d = z;
        this.f225042e = 1;
    }
}
