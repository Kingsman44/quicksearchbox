package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.cm */
/* compiled from: PG */
public final class C82365cm extends C82594kz {

    /* renamed from: a */
    public String f225005a;

    /* renamed from: b */
    public String f225006b;

    /* renamed from: a */
    public final C82596la mo75877a() {
        String str;
        String str2 = this.f225005a;
        if (str2 != null && (str = this.f225006b) != null) {
            return new C82366cn(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225005a == null) {
            sb.append(" token");
        }
        if (this.f225006b == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
