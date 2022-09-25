package androidx.media3.exoplayer.p145h;

import android.util.Pair;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.p132b.C2495an;

/* renamed from: androidx.media3.exoplayer.h.an */
/* compiled from: PG */
public final class C3031an extends C3115j {

    /* renamed from: a */
    public C3029al f8786a;

    /* renamed from: b */
    private final C3038au f8787b;

    /* renamed from: c */
    private final boolean f8788c;

    /* renamed from: d */
    private final C2650bl f8789d;

    /* renamed from: e */
    private final C2649bk f8790e;

    /* renamed from: f */
    private C3028ak f8791f;

    /* renamed from: g */
    private boolean f8792g;

    /* renamed from: h */
    private boolean f8793h;

    /* renamed from: i */
    private boolean f8794i;

    public C3031an(C3038au auVar, boolean z) {
        this.f8787b = auVar;
        boolean z2 = false;
        if (z && auVar.mo6941D()) {
            z2 = true;
        }
        this.f8788c = z2;
        this.f8789d = new C2650bl();
        this.f8790e = new C2649bk();
        C2651bm o = auVar.mo6942o();
        if (o != null) {
            this.f8786a = new C3029al(o, (Object) null, (Object) null);
            this.f8794i = true;
            return;
        }
        this.f8786a = new C3029al(new C3030am(auVar.mo6745a()), C2650bl.f7335a, C3029al.f8782b);
    }

    /* renamed from: E */
    private final Object m8667E(Object obj) {
        return (this.f8786a.f8783d == null || !obj.equals(C3029al.f8782b)) ? obj : this.f8786a.f8783d;
    }

    /* renamed from: F */
    private final void m8668F(long j) {
        C3028ak akVar = this.f8791f;
        int a = this.f8786a.mo6020a(akVar.f8773a.f7204a);
        if (a != -1) {
            C3029al alVar = this.f8786a;
            C2649bk bkVar = this.f8790e;
            alVar.mo6023d(a, bkVar, false);
            long j2 = bkVar.f7331d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            akVar.f8775c = j;
        }
    }

    /* renamed from: a */
    public final C2590aq mo6745a() {
        return this.f8787b.mo6745a();
    }

    /* renamed from: c */
    public final void mo6747c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C3036as mo6963d(Object obj, C3036as asVar) {
        Void voidR = (Void) obj;
        Object obj2 = asVar.f7204a;
        Object obj3 = this.f8786a.f8783d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = C3029al.f8782b;
        }
        return asVar.mo6972b(obj2);
    }

    /* renamed from: f */
    public final void mo6750f(C2495an anVar) {
        super.mo6750f(anVar);
        if (!this.f8788c) {
            this.f8792g = true;
            mo7104k((Object) null, this.f8787b);
        }
    }

    /* renamed from: h */
    public final void mo6752h(C3034aq aqVar) {
        ((C3028ak) aqVar).mo6968p();
        if (aqVar == this.f8791f) {
            this.f8791f = null;
        }
    }

    /* renamed from: i */
    public final void mo6753i() {
        this.f8793h = false;
        this.f8792g = false;
        super.mo6753i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo6964j(Object obj, C3038au auVar, C2651bm bmVar) {
        C3029al alVar;
        C3029al alVar2;
        C2651bm bmVar2 = bmVar;
        Void voidR = (Void) obj;
        C3036as asVar = null;
        if (this.f8793h) {
            this.f8786a = this.f8786a.mo6970p(bmVar2);
            C3028ak akVar = this.f8791f;
            if (akVar != null) {
                m8668F(akVar.f8775c);
            }
        } else if (bmVar.mo6304o()) {
            if (this.f8794i) {
                alVar2 = this.f8786a.mo6970p(bmVar2);
            } else {
                alVar2 = new C3029al(bmVar2, C2650bl.f7335a, C3029al.f8782b);
            }
            this.f8786a = alVar2;
        } else {
            bmVar2.mo6024e(0, this.f8789d, 0);
            C2650bl blVar = this.f8789d;
            long j = blVar.f7348m;
            Object obj2 = blVar.f7337b;
            C3028ak akVar2 = this.f8791f;
            if (akVar2 != null) {
                long j2 = akVar2.f8774b;
                this.f8786a.mo6303n(akVar2.f8773a.f7204a, this.f8790e);
                long j3 = this.f8790e.f7332e + j2;
                C3029al alVar3 = this.f8786a;
                C2650bl blVar2 = this.f8789d;
                alVar3.mo6024e(0, blVar2, 0);
                if (j3 != blVar2.f7348m) {
                    j = j3;
                }
            }
            Pair l = bmVar.mo6301l(this.f8789d, this.f8790e, 0, j);
            Object obj3 = l.first;
            long longValue = ((Long) l.second).longValue();
            if (this.f8794i) {
                alVar = this.f8786a.mo6970p(bmVar2);
            } else {
                alVar = new C3029al(bmVar2, obj2, obj3);
            }
            this.f8786a = alVar;
            C3028ak akVar3 = this.f8791f;
            if (akVar3 != null) {
                m8668F(longValue);
                C3036as asVar2 = akVar3.f8773a;
                asVar = asVar2.mo6972b(m8667E(asVar2.f7204a));
            }
        }
        this.f8794i = true;
        this.f8793h = true;
        mo6952y(this.f8786a);
        if (asVar != null) {
            C3028ak akVar4 = this.f8791f;
            akVar4.getClass();
            akVar4.mo6967k(asVar);
        }
    }

    /* renamed from: n */
    public final C3028ak mo6757m(C3036as asVar, C3241g gVar, long j) {
        C3028ak akVar = new C3028ak(asVar, gVar, j);
        akVar.mo6969q(this.f8787b);
        if (this.f8793h) {
            akVar.mo6967k(asVar.mo6972b(m8667E(asVar.f7204a)));
        } else {
            this.f8791f = akVar;
            if (!this.f8792g) {
                this.f8792g = true;
                mo7104k((Object) null, this.f8787b);
            }
        }
        return akVar;
    }
}
