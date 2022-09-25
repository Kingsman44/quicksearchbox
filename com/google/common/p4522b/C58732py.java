package com.google.common.p4522b;

import com.google.common.p4575r.C60757n;

/* renamed from: com.google.common.b.py */
/* compiled from: PG */
public final class C58732py extends C58517hz {

    /* renamed from: a */
    public static final C58732py f156492a = new C58732py(new C58706oz());

    /* renamed from: b */
    final transient C58706oz f156493b;

    /* renamed from: d */
    private final transient int f156494d;

    /* renamed from: e */
    private transient C58528ij f156495e;

    public C58732py(C58706oz ozVar) {
        this.f156493b = ozVar;
        long j = 0;
        for (int i = 0; i < ozVar.f156439c; i++) {
            j += (long) ozVar.mo55794c(i);
        }
        this.f156494d = C60757n.m92748i(j);
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return false;
    }

    /* renamed from: c */
    public final C58528ij mo54974l() {
        C58528ij ijVar = this.f156495e;
        if (ijVar != null) {
            return ijVar;
        }
        C58730pw pwVar = new C58730pw(this);
        this.f156495e = pwVar;
        return pwVar;
    }

    /* renamed from: e */
    public final C58691ok mo55461e(int i) {
        return this.f156493b.mo55801j(i);
    }

    /* renamed from: lv */
    public final int mo54932lv(Object obj) {
        return this.f156493b.mo55793b(obj);
    }

    public final int size() {
        return this.f156494d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58731px(this);
    }
}
