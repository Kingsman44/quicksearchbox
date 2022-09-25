package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.u */
/* compiled from: PG */
public final class C78969u extends C78913a {

    /* renamed from: a */
    public C78952d f217221a;

    /* renamed from: b */
    public String f217222b;

    /* renamed from: c */
    private String f217223c;

    /* renamed from: a */
    public final C78953e mo73685a() {
        C78952d dVar;
        String str = this.f217223c;
        if (str != null && (dVar = this.f217221a) != null) {
            return new C78970v(str, dVar, this.f217222b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f217223c == null) {
            sb.append(" query");
        }
        if (this.f217221a == null) {
            sb.append(" target");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73686b(String str) {
        if (str != null) {
            this.f217223c = str;
            return;
        }
        throw new NullPointerException("Null query");
    }
}
