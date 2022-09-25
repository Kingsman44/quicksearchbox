package com.google.android.apps.gsa.nga.shared.p6352l.p6353a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.c */
/* compiled from: PG */
final class C81369c extends C81380n {

    /* renamed from: a */
    private C80267v f222707a;

    /* renamed from: b */
    private C80265t f222708b;

    /* renamed from: c */
    private int f222709c;

    /* renamed from: a */
    public final C81381o mo75042a() {
        int i;
        C80265t tVar;
        C80267v vVar = this.f222707a;
        if (vVar != null && (i = this.f222709c) != 0 && (tVar = this.f222708b) != null) {
            return new C81370d(vVar, i, tVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f222707a == null) {
            sb.append(" flowId");
        }
        if (this.f222709c == 0) {
            sb.append(" triggerSource");
        }
        if (this.f222708b == null) {
            sb.append(" failureCause");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75043b(C80265t tVar) {
        if (tVar != null) {
            this.f222708b = tVar;
            return;
        }
        throw new NullPointerException("Null failureCause");
    }

    /* renamed from: c */
    public final void mo75044c(C80267v vVar) {
        if (vVar != null) {
            this.f222707a = vVar;
            return;
        }
        throw new NullPointerException("Null flowId");
    }

    /* renamed from: d */
    public final void mo75045d(int i) {
        if (i != 0) {
            this.f222709c = i;
            return;
        }
        throw new NullPointerException("Null triggerSource");
    }
}
