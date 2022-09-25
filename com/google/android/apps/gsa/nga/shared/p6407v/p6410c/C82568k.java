package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.k */
/* compiled from: PG */
public final class C82568k extends C82510hw {

    /* renamed from: a */
    public String f225470a;

    /* renamed from: b */
    public String f225471b;

    /* renamed from: a */
    public final C82511hx mo76548a() {
        String str;
        String str2 = this.f225470a;
        if (str2 != null && (str = this.f225471b) != null) {
            return new C82595l(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225470a == null) {
            sb.append(" token");
        }
        if (this.f225471b == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
