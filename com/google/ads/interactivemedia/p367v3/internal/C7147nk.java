package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nk */
/* compiled from: PG */
public final class C7147nk implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f23097a = 0;

    /* renamed from: b */
    private C7056ka f23098b;

    /* renamed from: c */
    private C7154nr f23099c;

    /* renamed from: d */
    private boolean f23100d;

    static {
        int i = C7146nj.f23096b;
    }

    /* renamed from: a */
    private final boolean m21240a(C7050jv jvVar) {
        C7149nm nmVar = new C7149nm();
        if (nmVar.mo16208d(jvVar, true) && (nmVar.f23107b & 2) == 2) {
            int min = Math.min(nmVar.f23111f, 8);
            aee aee = new aee(min);
            jvVar.mo16094g(aee.mo14555i(), 0, min);
            m21241b(aee);
            if (aee.mo14550d() >= 5 && aee.mo14560n() == 127 && aee.mo14566t() == 1179402563) {
                this.f23099c = new C7145ni();
            } else {
                m21241b(aee);
                try {
                    if (atv.m19623o(1, aee, true)) {
                        this.f23099c = new C7156nt();
                    }
                } catch (C6886dt unused) {
                }
                m21241b(aee);
                if (C7151no.m21261d(aee)) {
                    this.f23099c = new C7151no();
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m21241b(aee aee) {
        aee.mo14554h(0);
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f23098b = kaVar;
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        C7154nr nrVar = this.f23099c;
        if (nrVar != null) {
            nrVar.mo16210f(j, j2);
        }
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        try {
            return m21240a(jvVar);
        } catch (C6886dt unused) {
            return false;
        }
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        ary.m19466s(this.f23098b);
        if (this.f23099c == null) {
            if (m21240a(jvVar)) {
                jvVar.mo16097j();
            } else {
                throw new C6886dt("Failed to determine bitstream type");
            }
        }
        if (!this.f23100d) {
            C7073kr ak = this.f23098b.mo16113ak(0, 1);
            this.f23098b.mo16114al();
            this.f23099c.mo16209e(this.f23098b, ak);
            this.f23100d = true;
        }
        return this.f23099c.mo16214j(jvVar, klVar);
    }
}
