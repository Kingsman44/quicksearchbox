package com.google.p4591e.p4592a.p4594b.p4595a;

import com.google.p386ak.p394d.C8387c;
import com.google.p4591e.p4592a.p4594b.C61028c;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: com.google.e.a.b.a.c */
/* compiled from: PG */
final class C61019c extends C61028c {

    /* renamed from: a */
    private final C8387c f165235a;

    public C61019c(C8387c cVar) {
        this.f165235a = cVar;
        cVar.f29235b = true;
    }

    /* renamed from: a */
    public final void mo57543a() {
        this.f165235a.flush();
    }

    /* renamed from: c */
    public final void mo57544c(boolean z) {
        this.f165235a.mo17142l(z);
    }

    /* renamed from: d */
    public final void mo57545d() {
        this.f165235a.mo17134e();
    }

    /* renamed from: e */
    public final void mo57546e() {
        this.f165235a.mo17135f();
    }

    /* renamed from: f */
    public final void mo57547f(String str) {
        this.f165235a.mo17137g(str);
    }

    /* renamed from: g */
    public final void mo57548g() {
        this.f165235a.mo17138h();
    }

    /* renamed from: h */
    public final void mo57549h(double d) {
        C8387c cVar = this.f165235a;
        cVar.mo17130b();
        if (cVar.f29235b || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            cVar.mo17129a();
            cVar.f29234a.append(Double.toString(d));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    /* renamed from: i */
    public final void mo57550i(float f) {
        C8387c cVar = this.f165235a;
        cVar.mo17130b();
        if (cVar.f29235b || (!Float.isNaN(f) && !Float.isInfinite(f))) {
            cVar.mo17129a();
            cVar.f29234a.append(Float.toString(f));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
    }

    /* renamed from: j */
    public final void mo57551j(int i) {
        this.f165235a.mo17139i((long) i);
    }

    /* renamed from: k */
    public final void mo57552k(long j) {
        this.f165235a.mo17139i(j);
    }

    /* renamed from: l */
    public final void mo57553l(BigDecimal bigDecimal) {
        this.f165235a.mo17140j(bigDecimal);
    }

    /* renamed from: m */
    public final void mo57554m(BigInteger bigInteger) {
        this.f165235a.mo17140j(bigInteger);
    }

    /* renamed from: n */
    public final void mo57555n() {
        this.f165235a.mo17131c();
    }

    /* renamed from: o */
    public final void mo57556o() {
        this.f165235a.mo17133d();
    }

    /* renamed from: p */
    public final void mo57557p(String str) {
        this.f165235a.mo17141k(str);
    }
}
