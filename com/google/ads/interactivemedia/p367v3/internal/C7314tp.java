package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tp */
/* compiled from: PG */
public final class C7314tp implements C7320tv, C7319tu {

    /* renamed from: a */
    public final C7323ty f23832a;

    /* renamed from: b */
    public final C7321tw f23833b;

    /* renamed from: c */
    private C7320tv f23834c;

    /* renamed from: d */
    private C7319tu f23835d;

    /* renamed from: e */
    private final long f23836e;

    /* renamed from: f */
    private long f23837f = -9223372036854775807L;

    /* renamed from: g */
    private final acc f23838g;

    public C7314tp(C7323ty tyVar, C7321tw twVar, acc acc, long j) {
        this.f23833b = twVar;
        this.f23838g = acc;
        this.f23832a = tyVar;
        this.f23836e = j;
    }

    /* renamed from: u */
    private final long m21861u(long j) {
        long j2 = this.f23837f;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: a */
    public final void mo16497a(C7319tu tuVar, long j) {
        this.f23835d = tuVar;
        C7320tv tvVar = this.f23834c;
        if (tvVar != null) {
            tvVar.mo16497a(this, m21861u(this.f23836e));
        }
    }

    /* renamed from: b */
    public final void mo16498b() {
        try {
            C7320tv tvVar = this.f23834c;
            if (tvVar != null) {
                tvVar.mo16498b();
            } else {
                this.f23832a.mo16515u();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public final C7362vj mo16499c() {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        return tvVar.mo16499c();
    }

    /* renamed from: d */
    public final long mo16500d(aba[] abaArr, boolean[] zArr, C7354vb[] vbVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f23837f;
        if (j3 == -9223372036854775807L || j != this.f23836e) {
            j2 = j;
        } else {
            this.f23837f = -9223372036854775807L;
            j2 = j3;
        }
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        return tvVar.mo16500d(abaArr, zArr, vbVarArr, zArr2, j2);
    }

    /* renamed from: e */
    public final void mo16501e(long j, boolean z) {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        tvVar.mo16501e(j, false);
    }

    /* renamed from: f */
    public final void mo16502f(long j) {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        tvVar.mo16502f(j);
    }

    /* renamed from: g */
    public final long mo16503g() {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        return tvVar.mo16503g();
    }

    /* renamed from: h */
    public final long mo16504h() {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        return tvVar.mo16504h();
    }

    /* renamed from: i */
    public final long mo16505i(long j) {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        return tvVar.mo16505i(j);
    }

    /* renamed from: j */
    public final long mo16506j(long j, C6900eg egVar) {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        return tvVar.mo16506j(j, egVar);
    }

    /* renamed from: k */
    public final void mo15597k(C7320tv tvVar) {
        C7319tu tuVar = this.f23835d;
        int i = aeu.f20466a;
        tuVar.mo15597k(this);
    }

    /* renamed from: l */
    public final long mo16507l() {
        C7320tv tvVar = this.f23834c;
        int i = aeu.f20466a;
        return tvVar.mo16507l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ void mo15598m(C7356vd vdVar) {
        C7320tv tvVar = (C7320tv) vdVar;
        C7319tu tuVar = this.f23835d;
        int i = aeu.f20466a;
        tuVar.mo15598m(this);
    }

    /* renamed from: n */
    public final boolean mo16508n(long j) {
        C7320tv tvVar = this.f23834c;
        return tvVar != null && tvVar.mo16508n(j);
    }

    /* renamed from: o */
    public final boolean mo16509o() {
        C7320tv tvVar = this.f23834c;
        return tvVar != null && tvVar.mo16509o();
    }

    /* renamed from: p */
    public final long mo16533p() {
        return this.f23836e;
    }

    /* renamed from: q */
    public final void mo16534q(long j) {
        this.f23837f = j;
    }

    /* renamed from: r */
    public final long mo16535r() {
        return this.f23837f;
    }

    /* renamed from: s */
    public final void mo16536s(C7321tw twVar) {
        long u = m21861u(this.f23836e);
        C7320tv W = this.f23832a.mo16524W(twVar, this.f23838g, u);
        this.f23834c = W;
        if (this.f23835d != null) {
            W.mo16497a(this, u);
        }
    }

    /* renamed from: t */
    public final void mo16537t() {
        C7320tv tvVar = this.f23834c;
        if (tvVar != null) {
            this.f23832a.mo16523V(tvVar);
        }
    }
}
