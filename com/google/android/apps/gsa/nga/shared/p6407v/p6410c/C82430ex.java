package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ex */
/* compiled from: PG */
public final class C82430ex extends C82660nk {

    /* renamed from: a */
    public String f225225a;

    /* renamed from: b */
    public Double f225226b;

    /* renamed from: c */
    public String f225227c;

    /* renamed from: a */
    public final C82661nl mo76190a() {
        Double d;
        String str;
        String str2 = this.f225225a;
        if (str2 != null && (d = this.f225226b) != null && (str = this.f225227c) != null) {
            return new C82431ey(str2, d, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225225a == null) {
            sb.append(" token");
        }
        if (this.f225226b == null) {
            sb.append(" value");
        }
        if (this.f225227c == null) {
            sb.append(" contextPart");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
