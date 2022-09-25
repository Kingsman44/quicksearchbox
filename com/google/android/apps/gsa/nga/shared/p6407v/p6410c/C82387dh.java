package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dh */
/* compiled from: PG */
public final class C82387dh extends C82616lu {

    /* renamed from: a */
    public String f225089a;

    /* renamed from: b */
    public Double f225090b;

    /* renamed from: c */
    public String f225091c;

    /* renamed from: a */
    public final C82617lv mo75980a() {
        Double d;
        String str;
        String str2 = this.f225089a;
        if (str2 != null && (d = this.f225090b) != null && (str = this.f225091c) != null) {
            return new C82388di(str2, d, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225089a == null) {
            sb.append(" token");
        }
        if (this.f225090b == null) {
            sb.append(" value");
        }
        if (this.f225091c == null) {
            sb.append(" memoryType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
