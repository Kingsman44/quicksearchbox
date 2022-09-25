package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.t */
/* compiled from: PG */
public final class C82742t extends C82520if {

    /* renamed from: a */
    public String f225491a;

    /* renamed from: b */
    public String f225492b;

    /* renamed from: a */
    public final C82521ig mo76560a() {
        String str;
        String str2 = this.f225491a;
        if (str2 != null && (str = this.f225492b) != null) {
            return new C82743u(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225491a == null) {
            sb.append(" token");
        }
        if (this.f225492b == null) {
            sb.append(" errorMessage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
