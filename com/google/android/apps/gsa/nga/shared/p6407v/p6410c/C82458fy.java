package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fy */
/* compiled from: PG */
public final class C82458fy extends C82688ol {

    /* renamed from: a */
    public String f225305a;

    /* renamed from: b */
    public String f225306b;

    /* renamed from: c */
    private int f225307c;

    /* renamed from: d */
    private byte f225308d;

    /* renamed from: a */
    public final C82689om mo76311a() {
        String str;
        String str2;
        if (this.f225308d == 1 && (str = this.f225305a) != null && (str2 = this.f225306b) != null) {
            return new C82459fz(str, this.f225307c, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225305a == null) {
            sb.append(" token");
        }
        if (this.f225308d == 0) {
            sb.append(" contextType");
        }
        if (this.f225306b == null) {
            sb.append(" reason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76312b(int i) {
        this.f225307c = i;
        this.f225308d = 1;
    }
}
