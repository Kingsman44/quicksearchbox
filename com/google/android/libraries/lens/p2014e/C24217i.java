package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.e.i */
/* compiled from: PG */
public final class C24217i extends C24200ac {

    /* renamed from: a */
    public C24203af f66240a;

    /* renamed from: b */
    public C24202ae f66241b;

    /* renamed from: c */
    public C58833ax f66242c = C58836b.f156633a;

    /* renamed from: d */
    private C24205ah f66243d;

    /* renamed from: e */
    private C24227s f66244e;

    /* renamed from: a */
    public final C24201ad mo29675a() {
        C24202ae aeVar;
        C24205ah ahVar;
        C24227s sVar;
        C24203af afVar = this.f66240a;
        if (afVar != null && (aeVar = this.f66241b) != null && (ahVar = this.f66243d) != null && (sVar = this.f66244e) != null) {
            return new C24218j(afVar, aeVar, ahVar, sVar, this.f66242c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f66240a == null) {
            sb.append(" queryId");
        }
        if (this.f66241b == null) {
            sb.append(" context");
        }
        if (this.f66243d == null) {
            sb.append(" metadata");
        }
        if (this.f66244e == null) {
            sb.append(" image");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo29676b(C24227s sVar) {
        if (sVar != null) {
            this.f66244e = sVar;
            return;
        }
        throw new NullPointerException("Null image");
    }

    /* renamed from: c */
    public final void mo29677c(C24205ah ahVar) {
        if (ahVar != null) {
            this.f66243d = ahVar;
            return;
        }
        throw new NullPointerException("Null metadata");
    }
}
