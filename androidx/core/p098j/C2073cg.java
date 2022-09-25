package androidx.core.p098j;

import androidx.core.graphics.C1926c;

/* renamed from: androidx.core.j.cg */
/* compiled from: PG */
public class C2073cg {

    /* renamed from: a */
    private final C2082cp f5974a;

    /* renamed from: b */
    C1926c[] f5975b;

    public C2073cg() {
        this(new C2082cp());
    }

    public C2073cg(C2082cp cpVar) {
        this.f5974a = cpVar;
    }

    /* renamed from: a */
    public C2082cp mo5208a() {
        throw null;
    }

    /* renamed from: b */
    public void mo5209b(C1926c cVar) {
    }

    /* renamed from: c */
    public void mo5210c(C1926c cVar) {
    }

    /* renamed from: d */
    public void mo5211d(C1926c cVar) {
    }

    /* renamed from: e */
    public void mo5212e(C1926c cVar) {
    }

    /* renamed from: f */
    public void mo5213f(C1926c cVar) {
    }

    /* renamed from: g */
    public void mo5214g(int i, C1926c cVar) {
        if (this.f5975b == null) {
            this.f5975b = new C1926c[9];
        }
        for (int i2 = 1; i2 <= 256; i2 += i2) {
            if ((i2 & 7) != 0) {
                this.f5975b[C2080cn.m5714a(i2)] = cVar;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5215h() {
        C1926c[] cVarArr = this.f5975b;
        if (cVarArr != null) {
            C1926c cVar = cVarArr[C2080cn.m5714a(1)];
            C1926c cVar2 = this.f5975b[C2080cn.m5714a(2)];
            if (cVar2 == null) {
                cVar2 = this.f5974a.f5994b.mo5216a(2);
            }
            if (cVar == null) {
                cVar = this.f5974a.f5994b.mo5216a(1);
            }
            mo5212e(C1926c.m5196b(cVar, cVar2));
            C1926c cVar3 = this.f5975b[C2080cn.m5714a(16)];
            if (cVar3 != null) {
                mo5211d(cVar3);
            }
            C1926c cVar4 = this.f5975b[C2080cn.m5714a(32)];
            if (cVar4 != null) {
                mo5209b(cVar4);
            }
            C1926c cVar5 = this.f5975b[C2080cn.m5714a(64)];
            if (cVar5 != null) {
                mo5213f(cVar5);
            }
        }
    }
}
