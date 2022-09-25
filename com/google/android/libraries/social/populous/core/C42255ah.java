package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.ah */
/* compiled from: PG */
public final class C42255ah extends C42319cr {

    /* renamed from: a */
    public String f110840a;

    /* renamed from: b */
    private C42320cs f110841b;

    /* renamed from: a */
    public final C42321ct mo45200a() {
        C42320cs csVar;
        String str = this.f110840a;
        if (str != null && (csVar = this.f110841b) != null) {
            return new C42256ai(str, csVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f110840a == null) {
            sb.append(" id");
        }
        if (this.f110841b == null) {
            sb.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45201b(String str) {
        if (str != null) {
            this.f110840a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: c */
    public final void mo45202c(C42320cs csVar) {
        if (csVar != null) {
            this.f110841b = csVar;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
