package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ad */
/* compiled from: PG */
public final class C82302ad extends C82530ip {

    /* renamed from: a */
    public String f224817a;

    /* renamed from: b */
    public String f224818b;

    /* renamed from: a */
    public final C82531iq mo75605a() {
        String str;
        String str2 = this.f224817a;
        if (str2 != null && (str = this.f224818b) != null) {
            return new C82303ae(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224817a == null) {
            sb.append(" token");
        }
        if (this.f224818b == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
