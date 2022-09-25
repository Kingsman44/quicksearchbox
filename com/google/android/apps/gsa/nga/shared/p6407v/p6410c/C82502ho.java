package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ho */
/* compiled from: PG */
public final class C82502ho extends C82732qb {

    /* renamed from: a */
    public String f225430a;

    /* renamed from: b */
    public String f225431b;

    /* renamed from: c */
    public String f225432c;

    /* renamed from: a */
    public final C82733qc mo76505a() {
        String str;
        String str2;
        String str3 = this.f225430a;
        if (str3 != null && (str = this.f225431b) != null && (str2 = this.f225432c) != null) {
            return new C82503hp(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225430a == null) {
            sb.append(" token");
        }
        if (this.f225431b == null) {
            sb.append(" language");
        }
        if (this.f225432c == null) {
            sb.append(" errorMessage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
