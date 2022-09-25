package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ej */
/* compiled from: PG */
public final class C82416ej extends C82645mw {

    /* renamed from: a */
    public String f225171a;

    /* renamed from: b */
    public String f225172b;

    /* renamed from: a */
    public final C82646mx mo76117a() {
        String str;
        String str2 = this.f225171a;
        if (str2 != null && (str = this.f225172b) != null) {
            return new C82417ek(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225171a == null) {
            sb.append(" token");
        }
        if (this.f225172b == null) {
            sb.append(" loggingStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
