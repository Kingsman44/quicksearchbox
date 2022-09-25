package com.google.android.libraries.p10923ac.p10925b.p10942i;

import com.google.android.libraries.p10923ac.p10925b.p10945l.C147173g;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64060dp;

/* renamed from: com.google.android.libraries.ac.b.i.a */
/* compiled from: PG */
public final class C147055a implements C147094q {

    /* renamed from: a */
    public final Object f397054a = new Object();

    /* renamed from: b */
    private final C147094q f397055b;

    /* renamed from: c */
    private C64057dm f397056c;

    /* renamed from: d */
    private C64060dp f397057d;

    /* renamed from: e */
    private Long f397058e;

    /* renamed from: f */
    private Long f397059f;

    /* renamed from: g */
    private Integer f397060g;

    public C147055a(C147094q qVar) {
        this.f397055b = qVar;
    }

    public final void close() {
        synchronized (this.f397054a) {
            this.f397055b.close();
            mo123867m();
        }
    }

    /* renamed from: j */
    public final void mo123855j(C147078aw awVar, long j) {
        awVar.mo123891e(this);
        synchronized (this.f397054a) {
            ((C147086i) this.f397055b).f397143g.mo123875f(awVar, C147086i.f397142f, C147173g.m239997b(j));
        }
    }

    /* renamed from: k */
    public final void mo123856k(C147078aw awVar, C64057dm dmVar) {
        awVar.mo123891e(this);
        synchronized (this.f397054a) {
            ((C147086i) this.f397055b).f397143g.mo123875f(awVar, C147086i.f397137a, dmVar.toByteString());
            this.f397056c = dmVar;
        }
    }

    /* renamed from: l */
    public final void mo123857l(C147078aw awVar) {
        synchronized (this.f397054a) {
            ((C147086i) this.f397055b).f397143g.mo123873d(awVar, C63088z.f170246b, (C63088z) null);
            mo123867m();
        }
    }

    /* renamed from: la */
    public final int mo123858la(C147077av avVar) {
        int intValue;
        synchronized (this.f397054a) {
            if (this.f397060g == null) {
                this.f397060g = Integer.valueOf((int) C147173g.m239996a(((C147086i) this.f397055b).f397143g.mo123869a(avVar, C147086i.f397141e), -1));
            }
            intValue = this.f397060g.intValue();
        }
        return intValue;
    }

    /* renamed from: lb */
    public final long mo123859lb(C147077av avVar) {
        long longValue;
        synchronized (this.f397054a) {
            if (this.f397059f == null) {
                this.f397059f = Long.valueOf(C147173g.m239996a(((C147086i) this.f397055b).f397143g.mo123869a(avVar, C147086i.f397140d), 0));
            }
            longValue = this.f397059f.longValue();
        }
        return longValue;
    }

    /* renamed from: lc */
    public final long mo123860lc(C147077av avVar) {
        long longValue;
        synchronized (this.f397054a) {
            if (this.f397058e == null) {
                this.f397058e = Long.valueOf(C147173g.m239996a(((C147086i) this.f397055b).f397143g.mo123869a(avVar, C147086i.f397139c), 0));
            }
            longValue = this.f397058e.longValue();
        }
        return longValue;
    }

    /* renamed from: ld */
    public final C64057dm mo123861ld(C147077av avVar) {
        C64057dm dmVar;
        C64057dm dmVar2;
        synchronized (this.f397054a) {
            if (this.f397056c == null) {
                try {
                    C63088z a = ((C147086i) this.f397055b).f397143g.mo123869a(avVar, C147086i.f397137a);
                    if (a != null) {
                        dmVar2 = (C64057dm) C62942bv.parseFrom((C62942bv) C64057dm.f173196c, a);
                    } else {
                        dmVar2 = C64057dm.f173196c;
                    }
                    this.f397056c = dmVar2;
                } catch (C62974ct e) {
                    throw new C147075at("Unable to parse sync token", e);
                }
            }
            dmVar = this.f397056c;
        }
        return dmVar;
    }

    /* renamed from: le */
    public final C64060dp mo123862le(C147077av avVar) {
        C64060dp dpVar;
        C64060dp dpVar2;
        synchronized (this.f397054a) {
            if (this.f397057d == null) {
                try {
                    C63088z a = ((C147086i) this.f397055b).f397143g.mo123869a(avVar, C147086i.f397138b);
                    if (a != null) {
                        dpVar2 = (C64060dp) C62942bv.parseFrom((C62942bv) C64060dp.f173200c, a);
                    } else {
                        dpVar2 = C64060dp.f173200c;
                    }
                    this.f397057d = dpVar2;
                } catch (C62974ct e) {
                    throw new C147075at("Unable to parse channel filter", e);
                }
            }
            dpVar = this.f397057d;
        }
        return dpVar;
    }

    /* renamed from: lf */
    public final void mo123863lf(C147078aw awVar, int i) {
        awVar.mo123891e(this);
        synchronized (this.f397054a) {
            ((C147086i) this.f397055b).f397143g.mo123875f(awVar, C147086i.f397141e, C147173g.m239997b((long) i));
            this.f397060g = Integer.valueOf(i);
        }
    }

    /* renamed from: lg */
    public final void mo123864lg(C147078aw awVar, C64060dp dpVar) {
        awVar.mo123891e(this);
        synchronized (this.f397054a) {
            ((C147086i) this.f397055b).f397143g.mo123875f(awVar, C147086i.f397138b, dpVar.toByteString());
            this.f397057d = dpVar;
        }
    }

    /* renamed from: lh */
    public final void mo123865lh(C147078aw awVar, long j) {
        awVar.mo123891e(this);
        synchronized (this.f397054a) {
            ((C147086i) this.f397055b).f397143g.mo123875f(awVar, C147086i.f397140d, C147173g.m239997b(j));
            this.f397059f = Long.valueOf(j);
        }
    }

    /* renamed from: li */
    public final void mo123866li(C147078aw awVar, long j) {
        awVar.mo123891e(this);
        synchronized (this.f397054a) {
            ((C147086i) this.f397055b).f397143g.mo123875f(awVar, C147086i.f397139c, C147173g.m239997b(j));
            this.f397058e = Long.valueOf(j);
        }
    }

    /* renamed from: m */
    public final void mo123867m() {
        this.f397056c = null;
        this.f397057d = null;
        this.f397058e = null;
        this.f397059f = null;
        this.f397060g = null;
    }
}
