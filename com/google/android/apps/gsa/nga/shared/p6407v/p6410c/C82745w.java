package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.w */
/* compiled from: PG */
public final class C82745w extends C82523ii {

    /* renamed from: a */
    public String f225498a;

    /* renamed from: b */
    public String f225499b;

    /* renamed from: c */
    private int f225500c;

    /* renamed from: d */
    private int f225501d;

    /* renamed from: e */
    private byte f225502e;

    /* renamed from: a */
    public final C82524ij mo76564a() {
        String str;
        String str2;
        if (this.f225502e == 3 && (str = this.f225498a) != null && (str2 = this.f225499b) != null) {
            return new C82746x(str, str2, this.f225500c, this.f225501d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225498a == null) {
            sb.append(" token");
        }
        if (this.f225499b == null) {
            sb.append(" errorMessage");
        }
        if ((this.f225502e & 1) == 0) {
            sb.append(" resourceVersion");
        }
        if ((this.f225502e & 2) == 0) {
            sb.append(" resourceStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76565b(int i) {
        this.f225501d = i;
        this.f225502e = (byte) (this.f225502e | 2);
    }

    /* renamed from: c */
    public final void mo76566c(int i) {
        this.f225500c = i;
        this.f225502e = (byte) (this.f225502e | 1);
    }
}
