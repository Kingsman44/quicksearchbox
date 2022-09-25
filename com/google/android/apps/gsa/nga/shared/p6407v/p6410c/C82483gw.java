package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gw */
/* compiled from: PG */
public final class C82483gw extends C82713pj {

    /* renamed from: a */
    public String f225377a;

    /* renamed from: b */
    public String f225378b;

    /* renamed from: c */
    private boolean f225379c;

    /* renamed from: d */
    private byte f225380d;

    /* renamed from: a */
    public final C82714pk mo76427a() {
        String str;
        String str2;
        if (this.f225380d == 1 && (str = this.f225377a) != null && (str2 = this.f225378b) != null) {
            return new C82484gx(str, str2, this.f225379c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225377a == null) {
            sb.append(" token");
        }
        if (this.f225378b == null) {
            sb.append(" eventType");
        }
        if (this.f225380d == 0) {
            sb.append(" isCounterfactual");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76428b(boolean z) {
        this.f225379c = z;
        this.f225380d = 1;
    }
}
