package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hu */
/* compiled from: PG */
public final class C82508hu extends C82738qh {

    /* renamed from: a */
    public String f225460a;

    /* renamed from: b */
    public String f225461b;

    /* renamed from: a */
    public final C82739qi mo76543a() {
        String str;
        String str2 = this.f225460a;
        if (str2 != null && (str = this.f225461b) != null) {
            return new C82509hv(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225460a == null) {
            sb.append(" token");
        }
        if (this.f225461b == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
