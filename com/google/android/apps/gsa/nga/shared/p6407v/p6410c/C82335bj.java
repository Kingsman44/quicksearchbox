package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bj */
/* compiled from: PG */
public final class C82335bj extends C82564jw {

    /* renamed from: a */
    public String f224923a;

    /* renamed from: b */
    public String f224924b;

    /* renamed from: a */
    public final C82565jx mo75763a() {
        String str;
        String str2 = this.f224923a;
        if (str2 != null && (str = this.f224924b) != null) {
            return new C82336bk(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224923a == null) {
            sb.append(" token");
        }
        if (this.f224924b == null) {
            sb.append(" exception");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
