package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.da */
/* compiled from: PG */
public final class C82380da extends C82609ln {

    /* renamed from: a */
    public String f225064a;

    /* renamed from: b */
    public Double f225065b;

    /* renamed from: c */
    public String f225066c;

    /* renamed from: d */
    private boolean f225067d;

    /* renamed from: e */
    private boolean f225068e;

    /* renamed from: f */
    private byte f225069f;

    /* renamed from: a */
    public final C82610lo mo75949a() {
        String str;
        Double d;
        String str2;
        if (this.f225069f == 3 && (str = this.f225064a) != null && (d = this.f225065b) != null && (str2 = this.f225066c) != null) {
            return new C82381db(str, d, this.f225067d, this.f225068e, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225064a == null) {
            sb.append(" token");
        }
        if (this.f225065b == null) {
            sb.append(" value");
        }
        if ((this.f225069f & 1) == 0) {
            sb.append(" firstLifecycle");
        }
        if ((this.f225069f & 2) == 0) {
            sb.append(" lifecycleSucceeded");
        }
        if (this.f225066c == null) {
            sb.append(" failedComponent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75950b(boolean z) {
        this.f225067d = z;
        this.f225069f = (byte) (this.f225069f | 1);
    }

    /* renamed from: c */
    public final void mo75951c(boolean z) {
        this.f225068e = z;
        this.f225069f = (byte) (this.f225069f | 2);
    }
}
