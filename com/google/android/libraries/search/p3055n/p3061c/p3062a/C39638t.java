package com.google.android.libraries.search.p3055n.p3061c.p3062a;

/* renamed from: com.google.android.libraries.search.n.c.a.t */
/* compiled from: PG */
public final class C39638t extends C39391ag {

    /* renamed from: a */
    public String f104350a;

    /* renamed from: b */
    private C39392ah f104351b;

    /* renamed from: a */
    public final C39393ai mo41806a() {
        String str;
        C39392ah ahVar = this.f104351b;
        if (ahVar != null && (str = this.f104350a) != null) {
            return new C39639u(ahVar, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f104351b == null) {
            sb.append(" code");
        }
        if (this.f104350a == null) {
            sb.append(" message");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo41807b(C39392ah ahVar) {
        if (ahVar != null) {
            this.f104351b = ahVar;
            return;
        }
        throw new NullPointerException("Null code");
    }
}
