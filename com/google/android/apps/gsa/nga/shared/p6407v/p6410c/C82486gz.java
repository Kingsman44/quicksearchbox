package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gz */
/* compiled from: PG */
public final class C82486gz extends C82716pm {

    /* renamed from: a */
    public String f225386a;

    /* renamed from: b */
    public String f225387b;

    /* renamed from: a */
    public final C82717pn mo76438a() {
        String str;
        String str2 = this.f225386a;
        if (str2 != null && (str = this.f225387b) != null) {
            return new C82488ha(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225386a == null) {
            sb.append(" token");
        }
        if (this.f225387b == null) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
