package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.uv */
/* compiled from: PG */
public final class C7347uv extends C7290ss implements C7340uo {

    /* renamed from: a */
    private final C6873dg f23969a;

    /* renamed from: b */
    private final C6872df f23970b;

    /* renamed from: c */
    private final abw f23971c;

    /* renamed from: d */
    private final C7058kc f23972d;

    /* renamed from: e */
    private final C7036jh f23973e;

    /* renamed from: f */
    private final int f23974f = 1048576;

    /* renamed from: g */
    private boolean f23975g = true;

    /* renamed from: h */
    private long f23976h = -9223372036854775807L;

    /* renamed from: i */
    private boolean f23977i;

    /* renamed from: j */
    private boolean f23978j;

    /* renamed from: k */
    private adh f23979k;

    /* renamed from: l */
    private final acj f23980l;

    public C7347uv(C6873dg dgVar, abw abw, C7058kc kcVar, C7036jh jhVar, acj acj, int i) {
        C6872df dfVar = dgVar.f21858b;
        ary.m19467t(dfVar);
        this.f23970b = dfVar;
        this.f23969a = dgVar;
        this.f23971c = abw;
        this.f23972d = kcVar;
        this.f23973e = jhVar;
        this.f23980l = acj;
    }

    /* renamed from: y */
    private final void m22039y() {
        long j = this.f23976h;
        C7358vf vfVar = r1;
        C7358vf vfVar2 = new C7358vf(-9223372036854775807L, -9223372036854775807L, j, j, 0, 0, this.f23977i, false, this.f23978j, (Object) null, this.f23969a);
        mo16470e(this.f23975g ? new C7345ut(vfVar) : vfVar);
    }

    /* renamed from: U */
    public final C6873dg mo16522U() {
        return this.f23969a;
    }

    /* renamed from: V */
    public final void mo16523V(C7320tv tvVar) {
        ((C7344us) tvVar).mo16579k();
    }

    /* renamed from: W */
    public final C7320tv mo16524W(C7321tw twVar, acc acc, long j) {
        acg b = ((ach) this.f23971c).mo14408a();
        adh adh = this.f23979k;
        if (adh != null) {
            b.mo14402b(adh);
        }
        return new C7344us(this.f23970b.f21849a, b, this.f23972d, this.f23973e, mo16473h(twVar), this.f23980l, mo16471f(twVar), this, acc, 1048576);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16467a(adh adh) {
        this.f23979k = adh;
        this.f23973e.mo16070b();
        m22039y();
    }

    /* renamed from: b */
    public final void mo16574b(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f23976h;
        }
        if (this.f23975g || this.f23976h != j || this.f23977i != z || this.f23978j != z2) {
            this.f23976h = j;
            this.f23977i = z;
            this.f23978j = z2;
            this.f23975g = false;
            m22039y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo16469d() {
        this.f23973e.mo16071c();
    }

    /* renamed from: u */
    public final void mo16515u() {
    }
}
