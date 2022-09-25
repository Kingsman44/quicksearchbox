package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bm */
/* compiled from: PG */
public final class C82338bm extends C82567jz {

    /* renamed from: a */
    public String f224929a;

    /* renamed from: b */
    public String f224930b;

    /* renamed from: a */
    public final C82569ka mo75772a() {
        String str;
        String str2 = this.f224929a;
        if (str2 != null && (str = this.f224930b) != null) {
            return new C82339bn(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224929a == null) {
            sb.append(" token");
        }
        if (this.f224930b == null) {
            sb.append(" caseName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
