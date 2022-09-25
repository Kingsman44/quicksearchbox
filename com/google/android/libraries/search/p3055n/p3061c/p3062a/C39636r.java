package com.google.android.libraries.search.p3055n.p3061c.p3062a;

/* renamed from: com.google.android.libraries.search.n.c.a.r */
/* compiled from: PG */
public final class C39636r extends C39380a {

    /* renamed from: a */
    public String f104346a;

    /* renamed from: b */
    private C39389ae f104347b;

    /* renamed from: a */
    public final C39411b mo41790a() {
        C39389ae aeVar;
        String str = this.f104346a;
        if (str != null && (aeVar = this.f104347b) != null) {
            return new C39637s(str, aeVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f104346a == null) {
            sb.append(" appFlowLoggingTag");
        }
        if (this.f104347b == null) {
            sb.append(" requester");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo41791b(C39389ae aeVar) {
        if (aeVar != null) {
            this.f104347b = aeVar;
            return;
        }
        throw new NullPointerException("Null requester");
    }
}
