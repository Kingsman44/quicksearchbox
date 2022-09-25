package com.google.android.apps.gsa.opaonboarding;

/* renamed from: com.google.android.apps.gsa.opaonboarding.i */
/* compiled from: PG */
public final class C83942i extends C83881ao {

    /* renamed from: a */
    public C83956t f228630a;

    /* renamed from: b */
    public C83904bj f228631b;

    /* renamed from: a */
    public final C83882ap mo77241a() {
        C83904bj bjVar;
        C83956t tVar = this.f228630a;
        if (tVar != null && (bjVar = this.f228631b) != null) {
            return new C83943j(tVar, bjVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f228630a == null) {
            sb.append(" sequence");
        }
        if (this.f228631b == null) {
            sb.append(" resultFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77242b(C83904bj bjVar) {
        if (bjVar != null) {
            this.f228631b = bjVar;
            return;
        }
        throw new NullPointerException("Null resultFactory");
    }

    /* renamed from: c */
    public final void mo77243c(C83956t tVar) {
        if (tVar != null) {
            this.f228630a = tVar;
            return;
        }
        throw new NullPointerException("Null sequence");
    }
}
