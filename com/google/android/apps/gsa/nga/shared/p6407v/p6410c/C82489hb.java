package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hb */
/* compiled from: PG */
public final class C82489hb extends C82718po {

    /* renamed from: a */
    public String f225394a;

    /* renamed from: b */
    public String f225395b;

    /* renamed from: c */
    private String f225396c;

    /* renamed from: a */
    public final C82719pp mo76446a() {
        String str;
        String str2;
        String str3 = this.f225394a;
        if (str3 != null && (str = this.f225395b) != null && (str2 = this.f225396c) != null) {
            return new C82490hc(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f225394a == null) {
            sb.append(" token");
        }
        if (this.f225395b == null) {
            sb.append(" eventType");
        }
        if (this.f225396c == null) {
            sb.append(" usecaseType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo76447b(String str) {
        if (str != null) {
            this.f225396c = str;
            return;
        }
        throw new NullPointerException("Null usecaseType");
    }
}
