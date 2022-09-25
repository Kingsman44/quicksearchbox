package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.i */
/* compiled from: PG */
public final class C82514i extends C82379d {

    /* renamed from: a */
    public String f225464a;

    /* renamed from: b */
    public String f225465b;

    /* renamed from: c */
    private String f225466c;

    /* renamed from: a */
    public final C82406e mo75947a() {
        String str;
        String str2;
        String str3 = this.f225464a;
        if (str3 != null && (str = this.f225465b) != null && (str2 = this.f225466c) != null) {
            return new C82541j(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225464a == null) {
            sb.append(" token");
        }
        if (this.f225465b == null) {
            sb.append(" routeType");
        }
        if (this.f225466c == null) {
            sb.append(" reason");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75948b(String str) {
        if (str != null) {
            this.f225466c = str;
            return;
        }
        throw new NullPointerException("Null reason");
    }
}
