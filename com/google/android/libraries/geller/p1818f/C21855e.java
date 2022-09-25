package com.google.android.libraries.geller.p1818f;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.libraries.geller.f.e */
/* compiled from: PG */
final class C21855e extends C21849ce {

    /* renamed from: a */
    private C58526ih f60318a;

    /* renamed from: b */
    private C58528ij f60319b;

    /* renamed from: c */
    private C58526ih f60320c;

    /* renamed from: d */
    private C58528ij f60321d;

    /* renamed from: e */
    private C58480gp f60322e;

    /* renamed from: f */
    private C58485gu f60323f;

    public C21855e() {
    }

    public C21855e(C21850cf cfVar) {
        C21856f fVar = (C21856f) cfVar;
        this.f60319b = fVar.f60324a;
        this.f60321d = fVar.f60325b;
        this.f60323f = fVar.f60326c;
    }

    /* renamed from: a */
    public final C21850cf mo27147a() {
        C58526ih ihVar = this.f60318a;
        if (ihVar != null) {
            this.f60319b = ihVar.mo55486f();
        } else if (this.f60319b == null) {
            this.f60319b = C58733pz.f156496a;
        }
        C58526ih ihVar2 = this.f60320c;
        if (ihVar2 != null) {
            this.f60321d = ihVar2.mo55486f();
        } else if (this.f60321d == null) {
            this.f60321d = C58733pz.f156496a;
        }
        C58480gp gpVar = this.f60322e;
        if (gpVar != null) {
            this.f60323f = gpVar.mo55394f();
        } else if (this.f60323f == null) {
            this.f60323f = C58485gu.m89845m();
        }
        return new C21856f(this.f60319b, this.f60321d, this.f60323f);
    }

    /* renamed from: b */
    public final C58480gp mo27148b() {
        if (this.f60322e == null) {
            if (this.f60323f == null) {
                this.f60322e = C58485gu.m89837e();
            } else {
                C58480gp e = C58485gu.m89837e();
                this.f60322e = e;
                e.mo55396h(this.f60323f);
                this.f60323f = null;
            }
        }
        return this.f60322e;
    }

    /* renamed from: c */
    public final C58526ih mo27149c() {
        if (this.f60318a == null) {
            if (this.f60319b == null) {
                this.f60318a = new C58526ih();
            } else {
                C58526ih ihVar = new C58526ih();
                this.f60318a = ihVar;
                ihVar.mo55489i(this.f60319b);
                this.f60319b = null;
            }
        }
        return this.f60318a;
    }

    /* renamed from: d */
    public final C58526ih mo27150d() {
        if (this.f60320c == null) {
            if (this.f60321d == null) {
                this.f60320c = new C58526ih();
            } else {
                C58526ih ihVar = new C58526ih();
                this.f60320c = ihVar;
                ihVar.mo55489i(this.f60321d);
                this.f60321d = null;
            }
        }
        return this.f60320c;
    }
}
