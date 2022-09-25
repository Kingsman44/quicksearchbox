package com.google.android.apps.gsa.nga.engine.p6056o;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.i */
/* compiled from: PG */
public final class C77415i extends C77431y {

    /* renamed from: a */
    private C60870cx f213448a;

    /* renamed from: b */
    private C60870cx f213449b;

    /* renamed from: a */
    public final C77432z mo72555a() {
        C60870cx cxVar;
        C60870cx cxVar2 = this.f213448a;
        if (cxVar2 != null && (cxVar = this.f213449b) != null) {
            return new C77416j(cxVar2, cxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f213448a == null) {
            sb.append(" assistData");
        }
        if (this.f213449b == null) {
            sb.append(" screenshot");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72556b(C60870cx cxVar) {
        if (cxVar != null) {
            this.f213448a = cxVar;
            return;
        }
        throw new NullPointerException("Null assistData");
    }

    /* renamed from: c */
    public final void mo72557c(C60870cx cxVar) {
        if (cxVar != null) {
            this.f213449b = cxVar;
            return;
        }
        throw new NullPointerException("Null screenshot");
    }
}
