package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.e.o */
/* compiled from: PG */
final class C24223o extends C24207aj {

    /* renamed from: a */
    public C24203af f66258a;

    /* renamed from: b */
    public C58833ax f66259b = C58836b.f156633a;

    /* renamed from: c */
    private C24229u f66260c;

    public C24223o() {
    }

    public C24223o(C24208ak akVar) {
        C24224p pVar = (C24224p) akVar;
        this.f66258a = pVar.f66261a;
        this.f66260c = pVar.f66262b;
        this.f66259b = pVar.f66263c;
    }

    /* renamed from: a */
    public final C24208ak mo29693a() {
        C24229u uVar;
        C24203af afVar = this.f66258a;
        if (afVar != null && (uVar = this.f66260c) != null) {
            return new C24224p(afVar, uVar, this.f66259b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f66258a == null) {
            sb.append(" queryId");
        }
        if (this.f66260c == null) {
            sb.append(" imageResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29694b(C24229u uVar) {
        if (uVar != null) {
            this.f66260c = uVar;
            return;
        }
        throw new NullPointerException("Null imageResult");
    }

    /* renamed from: c */
    public final void mo29695c(C24199ab abVar) {
        this.f66259b = C58833ax.m90833j(abVar);
    }
}
