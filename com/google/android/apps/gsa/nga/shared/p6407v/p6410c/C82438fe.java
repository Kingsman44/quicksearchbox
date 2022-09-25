package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fe */
/* compiled from: PG */
public final class C82438fe extends C82667nr {

    /* renamed from: a */
    public String f225251a;

    /* renamed from: b */
    public String f225252b;

    /* renamed from: c */
    public String f225253c;

    /* renamed from: d */
    private String f225254d;

    /* renamed from: a */
    public final C82668ns mo76221a() {
        String str;
        String str2;
        String str3;
        String str4 = this.f225251a;
        if (str4 != null && (str = this.f225252b) != null && (str2 = this.f225254d) != null && (str3 = this.f225253c) != null) {
            return new C82439ff(str4, str, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225251a == null) {
            sb.append(" token");
        }
        if (this.f225252b == null) {
            sb.append(" model");
        }
        if (this.f225254d == null) {
            sb.append(" fileId");
        }
        if (this.f225253c == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76222b(String str) {
        if (str != null) {
            this.f225254d = str;
            return;
        }
        throw new NullPointerException("Null fileId");
    }
}
