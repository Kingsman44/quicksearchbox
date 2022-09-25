package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cj */
/* compiled from: PG */
public final class C82362cj extends C82591kw {

    /* renamed from: a */
    public String f224999a;

    /* renamed from: b */
    public String f225000b;

    /* renamed from: a */
    public final C82592kx mo75868a() {
        String str;
        String str2 = this.f224999a;
        if (str2 != null && (str = this.f225000b) != null) {
            return new C82363ck(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224999a == null) {
            sb.append(" token");
        }
        if (this.f225000b == null) {
            sb.append(" intentGenerator");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
