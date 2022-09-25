package androidx.media3.common;

import androidx.media3.common.p136b.C2612ak;
import com.google.common.p4522b.C58485gu;

/* renamed from: androidx.media3.common.j */
/* compiled from: PG */
public abstract class C2666j implements C2646bh {

    /* renamed from: m */
    protected final C2650bl f7427m = new C2650bl();

    protected C2666j() {
    }

    /* renamed from: D */
    private final void m7203D(long j) {
        long k = mo6004k() + j;
        long l = mo6005l();
        if (l != -9223372036854775807L) {
            k = Math.min(k, l);
        }
        mo5973A(mo5996c(), Math.max(k, 0));
    }

    /* renamed from: q */
    private final int mo6010q() {
        int g = mo6000g();
        if (g == 1) {
            return 0;
        }
        return g;
    }

    @Deprecated
    /* renamed from: V */
    public final int mo6254V() {
        return mo5996c();
    }

    /* renamed from: W */
    public final int mo6255W() {
        return mo6014u().mo6022c();
    }

    /* renamed from: aa */
    public final C2590aq mo6256aa() {
        C2651bm u = mo6014u();
        if (u.mo6304o()) {
            return null;
        }
        return u.mo6024e(mo5996c(), this.f7427m, 0).f7338c;
    }

    /* renamed from: ab */
    public final C2590aq mo6257ab(int i) {
        return mo6014u().mo6024e(i, this.f7427m, 0).f7338c;
    }

    /* renamed from: ac */
    public final void mo6258ac() {
        mo5991S();
    }

    /* renamed from: ad */
    public final void mo6259ad() {
        mo5974B(false);
    }

    /* renamed from: ae */
    public final void mo6260ae() {
        mo5974B(true);
    }

    /* renamed from: af */
    public final void mo6261af() {
        m7203D(-mo6007n());
    }

    /* renamed from: ag */
    public final void mo6262ag() {
        m7203D(mo6008o());
    }

    /* renamed from: ah */
    public final void mo6263ah(long j) {
        mo5973A(mo5996c(), j);
    }

    /* renamed from: ai */
    public final void mo6264ai(int i) {
        mo5973A(i, -9223372036854775807L);
    }

    /* renamed from: aj */
    public final void mo6265aj() {
        if (!mo6014u().mo6304o() && !mo5989Q()) {
            if (mo6270ap()) {
                mo6266ak();
            } else if (mo6274at() && mo6273as()) {
                mo5973A(mo5996c(), -9223372036854775807L);
            }
        }
    }

    /* renamed from: ak */
    public final void mo6266ak() {
        int be = mo6335be();
        if (be != -1) {
            mo5973A(be, -9223372036854775807L);
        }
    }

    /* renamed from: al */
    public final void mo6267al() {
        if (!mo6014u().mo6304o() && !mo5989Q()) {
            boolean aq = mo6271aq();
            if (!mo6274at() || mo6275au()) {
                if (!aq || mo6004k() > mo6006m()) {
                    mo5973A(mo5996c(), 0);
                } else {
                    mo6338bh();
                }
            } else if (aq) {
                mo6338bh();
            }
        }
    }

    /* renamed from: an */
    public final void mo6268an(C2590aq aqVar, long j) {
        mo5993U(C58485gu.m89846n(aqVar), j);
    }

    /* renamed from: ao */
    public final void mo6269ao(float f) {
        mo5975C(mo6012s().mo6212a(f));
    }

    /* renamed from: ap */
    public final boolean mo6270ap() {
        return mo6335be() != -1;
    }

    /* renamed from: aq */
    public final boolean mo6271aq() {
        return mo6336bf() != -1;
    }

    /* renamed from: ar */
    public final boolean mo6272ar(int i) {
        return mo6013t().f7317a.f7443a.get(i);
    }

    /* renamed from: as */
    public final boolean mo6273as() {
        C2651bm u = mo6014u();
        return !u.mo6304o() && u.mo6024e(mo5996c(), this.f7427m, 0).f7344i;
    }

    /* renamed from: at */
    public final boolean mo6274at() {
        C2651bm u = mo6014u();
        return !u.mo6304o() && u.mo6024e(mo5996c(), this.f7427m, 0).mo6292a();
    }

    /* renamed from: au */
    public final boolean mo6275au() {
        C2651bm u = mo6014u();
        return !u.mo6304o() && u.mo6024e(mo5996c(), this.f7427m, 0).f7343h;
    }

    @Deprecated
    /* renamed from: av */
    public final boolean mo6276av() {
        return mo6275au();
    }

    /* renamed from: aw */
    public final boolean mo6277aw() {
        return mo5998e() == 3 && mo5987O() && mo5999f() == 0;
    }

    /* renamed from: be */
    public final int mo6335be() {
        C2651bm u = mo6014u();
        if (u.mo6304o()) {
            return -1;
        }
        return u.mo6299j(mo5996c(), mo6010q(), mo5988P());
    }

    /* renamed from: bf */
    public final int mo6336bf() {
        C2651bm u = mo6014u();
        if (u.mo6304o()) {
            return -1;
        }
        return u.mo6300k(mo5996c(), mo6010q(), mo5988P());
    }

    /* renamed from: bg */
    public final long mo6337bg() {
        C2651bm u = mo6014u();
        if (u.mo6304o()) {
            return -9223372036854775807L;
        }
        return C2612ak.m6918A(u.mo6024e(mo5996c(), this.f7427m, 0).f7349n);
    }

    /* renamed from: bh */
    public final void mo6338bh() {
        int bf = mo6336bf();
        if (bf != -1) {
            mo5973A(bf, -9223372036854775807L);
        }
    }
}
