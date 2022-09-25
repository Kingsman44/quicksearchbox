package androidx.media3.exoplayer.p137a;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2593at;
import androidx.media3.common.C2594au;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2640bb;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2643be;
import androidx.media3.common.C2645bg;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import androidx.media3.common.C2657bs;
import androidx.media3.common.C2658bt;
import androidx.media3.common.C2664h;
import androidx.media3.common.C2672p;
import androidx.media3.common.Metadata;
import androidx.media3.common.p135a.C2568d;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2616d;
import androidx.media3.common.p136b.C2626n;
import androidx.media3.common.p136b.C2629q;
import androidx.media3.common.p136b.C2632t;
import androidx.media3.exoplayer.C2848br;
import androidx.media3.exoplayer.C3004h;
import androidx.media3.exoplayer.C3267o;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import androidx.media3.exoplayer.p145h.C3036as;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.io.IOException;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.a.bl */
/* compiled from: PG */
public final class C2723bl implements C2684a {

    /* renamed from: a */
    public final SparseArray f7552a;

    /* renamed from: b */
    public C2632t f7553b;

    /* renamed from: c */
    private final C2616d f7554c;

    /* renamed from: d */
    private final C2649bk f7555d;

    /* renamed from: e */
    private final C2650bl f7556e = new C2650bl();

    /* renamed from: f */
    private final C2722bk f7557f;

    /* renamed from: g */
    private C2646bh f7558g;

    /* renamed from: h */
    private C2626n f7559h;

    /* renamed from: i */
    private boolean f7560i;

    /* renamed from: aj */
    private final C2711b m7430aj(int i, C3036as asVar) {
        C2646bh bhVar = this.f7558g;
        bhVar.getClass();
        if (asVar == null) {
            C2651bm u = bhVar.mo6014u();
            if (i >= u.mo6022c()) {
                u = C2651bm.f7353c;
            }
            return mo6402af(u, i, (C3036as) null);
        } else if (this.f7557f.mo6399a(asVar) != null) {
            return m7429ai(asVar);
        } else {
            return mo6402af(C2651bm.f7353c, i, asVar);
        }
    }

    /* renamed from: ak */
    private final C2711b m7431ak() {
        return m7429ai(this.f7557f.f7549d);
    }

    /* renamed from: al */
    private final C2711b m7432al() {
        return m7429ai(this.f7557f.f7550e);
    }

    /* renamed from: am */
    private final C2711b m7433am(C2639ba baVar) {
        C2594au auVar;
        if (!(baVar instanceof C3267o) || (auVar = ((C3267o) baVar).f9817h) == null) {
            return mo6401ae();
        }
        return m7429ai(new C3036as(auVar));
    }

    /* renamed from: A */
    public final void mo6220A(boolean z) {
        C2711b al = m7432al();
        mo6404ah(al, 23, new C2701aq(al, z));
    }

    /* renamed from: B */
    public final void mo6221B(int i, int i2) {
        C2711b al = m7432al();
        mo6404ah(al, 24, new C2718bg(al));
    }

    /* renamed from: D */
    public final void mo6223D(C2657bs bsVar) {
        C2711b ae = mo6401ae();
        mo6404ah(ae, 2, new C2752w(ae, bsVar));
    }

    /* renamed from: E */
    public final void mo6224E(C2658bt btVar) {
        C2711b al = m7432al();
        mo6404ah(al, 25, new C2715bd(al, btVar));
    }

    /* renamed from: F */
    public final void mo6225F(float f) {
        mo6404ah(m7432al(), 22, new C2739j());
    }

    /* renamed from: G */
    public final void mo6372G(C2733d dVar) {
        this.f7553b.mo6202a(dVar);
    }

    /* renamed from: H */
    public final void mo6373H() {
        if (!this.f7560i) {
            C2711b ae = mo6401ae();
            this.f7560i = true;
            mo6404ah(ae, -1, new C2714bc());
        }
    }

    /* renamed from: I */
    public final void mo6374I(int i, long j, long j2) {
        C2711b al = m7432al();
        mo6404ah(al, 1011, new C2738i(al, i, j, j2));
    }

    /* renamed from: J */
    public final void mo6375J(C3004h hVar) {
        mo6404ah(m7431ak(), 1020, new C2716be(hVar));
    }

    /* renamed from: K */
    public final void mo6376K() {
        C2626n nVar = this.f7559h;
        C2601a.m6829a(nVar);
        nVar.mo6167f(new C2712ba(this));
    }

    /* renamed from: L */
    public final void mo6377L(C2733d dVar) {
        this.f7553b.mo6206e(dVar);
    }

    /* renamed from: M */
    public final void mo6378M(C2646bh bhVar, Looper looper) {
        boolean z = true;
        if (this.f7558g != null && !this.f7557f.f7547b.isEmpty()) {
            z = false;
        }
        C2601a.m6832d(z);
        bhVar.getClass();
        this.f7558g = bhVar;
        this.f7559h = this.f7554c.mo6160b(looper, (Handler.Callback) null);
        C2632t tVar = this.f7553b;
        C2755z zVar = new C2755z(this, bhVar);
        this.f7553b = new C2632t(tVar.f7299d, looper, tVar.f7296a, zVar);
    }

    /* renamed from: N */
    public final void mo6379N(List list, C3036as asVar) {
        C2722bk bkVar = this.f7557f;
        C2646bh bhVar = this.f7558g;
        bhVar.getClass();
        bkVar.f7547b = C58485gu.m89842j(list);
        if (!list.isEmpty()) {
            bkVar.f7549d = (C3036as) list.get(0);
            asVar.getClass();
            bkVar.f7550e = asVar;
        }
        if (bkVar.f7548c == null) {
            bkVar.f7548c = C2722bk.m7424b(bhVar, bkVar.f7547b, bkVar.f7549d, bkVar.f7546a);
        }
        bkVar.mo6400c(bhVar.mo6014u());
    }

    /* renamed from: O */
    public final void mo6380O() {
        mo6404ah(m7432al(), 1029, new C2753x());
    }

    /* renamed from: P */
    public final void mo6381P() {
        mo6404ah(m7432al(), 1008, new C2695ak());
    }

    /* renamed from: Q */
    public final void mo6382Q() {
        mo6404ah(m7432al(), 1012, new C2721bj());
    }

    /* renamed from: R */
    public final void mo6383R() {
        mo6404ah(m7431ak(), 1013, new C2709ay());
    }

    /* renamed from: S */
    public final void mo6384S() {
        mo6404ah(m7432al(), 1007, new C2696al());
    }

    /* renamed from: T */
    public final void mo6385T() {
        mo6404ah(m7432al(), 1009, new C2708ax());
    }

    /* renamed from: U */
    public final void mo6386U() {
        mo6404ah(m7432al(), 1010, new C2713bb());
    }

    /* renamed from: V */
    public final void mo6387V() {
        mo6404ah(m7432al(), 1014, new C2747r());
    }

    /* renamed from: W */
    public final void mo6388W() {
        C2711b ak = m7431ak();
        mo6404ah(ak, 1018, new C2690af(ak));
    }

    /* renamed from: X */
    public final void mo6389X(Object obj) {
        mo6404ah(m7432al(), 26, new C2717bf(obj));
    }

    /* renamed from: Y */
    public final void mo6390Y() {
        mo6404ah(m7432al(), 1030, new C2745p());
    }

    /* renamed from: Z */
    public final void mo6391Z() {
        mo6404ah(m7432al(), 1016, new C2686ab());
    }

    /* renamed from: a */
    public final void mo6226a(C2664h hVar) {
        mo6404ah(m7432al(), 20, new C2710az());
    }

    /* renamed from: aa */
    public final void mo6392aa() {
        mo6404ah(m7432al(), 1019, new C2737h());
    }

    /* renamed from: ab */
    public final void mo6393ab() {
        mo6404ah(m7432al(), 1015, new C2691ag());
    }

    /* renamed from: ac */
    public final void mo6394ac() {
        C2711b ak = m7431ak();
        mo6404ah(ak, 1021, new C2748s(ak));
    }

    /* renamed from: ad */
    public final void mo6395ad() {
        mo6404ah(m7432al(), 1017, new C2736g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final C2711b mo6401ae() {
        return m7429ai(this.f7557f.f7548c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: af */
    public final C2711b mo6402af(C2651bm bmVar, int i, C3036as asVar) {
        C2651bm bmVar2 = bmVar;
        int i2 = i;
        boolean z = true;
        C3036as asVar2 = true == bmVar.mo6304o() ? null : asVar;
        long a = this.f7554c.mo6159a();
        if (!bmVar2.equals(this.f7558g.mo6014u()) || i2 != this.f7558g.mo5996c()) {
            z = false;
        }
        long j = 0;
        if (asVar2 == null || !asVar2.mo6102a()) {
            if (z) {
                j = this.f7558g.mo6003j();
            } else if (!bmVar.mo6304o()) {
                j = C2612ak.m6918A(bmVar2.mo6024e(i2, this.f7556e, 0).f7348m);
            }
        } else if (z && this.f7558g.mo5994a() == asVar2.f7205b && this.f7558g.mo5995b() == asVar2.f7206c) {
            j = this.f7558g.mo6004k();
        }
        C3036as asVar3 = this.f7557f.f7548c;
        C2651bm u = this.f7558g.mo6014u();
        int c = this.f7558g.mo5996c();
        long k = this.f7558g.mo6004k();
        C2848br brVar = (C2848br) this.f7558g;
        brVar.mo6600aQ();
        return new C2711b(a, bmVar, i, asVar2, j, u, c, asVar3, k, C2612ak.m6918A(brVar.f7954C.f8180r));
    }

    /* renamed from: ag */
    public final void mo6403ag(int i, long j, long j2) {
        C2722bk bkVar = this.f7557f;
        C2711b ai = m7429ai(bkVar.f7547b.isEmpty() ? null : (C3036as) C58557jl.m90131l(bkVar.f7547b));
        mo6404ah(ai, 1006, new C2746q(ai, i, j, j2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: ah */
    public final void mo6404ah(C2711b bVar, int i, C2629q qVar) {
        this.f7552a.put(i, bVar);
        C2632t tVar = this.f7553b;
        tVar.mo6204c(i, qVar);
        tVar.mo6203b();
    }

    /* renamed from: b */
    public final void mo6227b(C2642bd bdVar) {
        mo6404ah(mo6401ae(), 13, new C2750u());
    }

    /* renamed from: c */
    public final void mo6228c(C2568d dVar) {
        mo6404ah(mo6401ae(), 27, new C2697am());
    }

    /* renamed from: d */
    public final void mo6229d(List list) {
        mo6404ah(mo6401ae(), 27, new C2685aa());
    }

    /* renamed from: e */
    public final void mo6230e(C2672p pVar) {
        mo6404ah(mo6401ae(), 29, new C2751v());
    }

    /* renamed from: eO */
    public final void mo6405eO(int i, C3036as asVar, C3032ao aoVar) {
        C2711b aj = m7430aj(i, asVar);
        mo6404ah(aj, 1004, new C2743n(aj, aoVar));
    }

    /* renamed from: eP */
    public final void mo6406eP(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        mo6404ah(m7430aj(i, asVar), 1002, new C2692ah());
    }

    /* renamed from: eQ */
    public final void mo6407eQ(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        mo6404ah(m7430aj(i, asVar), 1001, new C2705au());
    }

    /* renamed from: eR */
    public final void mo6408eR(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar, IOException iOException, boolean z) {
        C2711b aj = m7430aj(i, asVar);
        mo6404ah(aj, 1003, new C2687ac(aj, ajVar, aoVar, iOException));
    }

    /* renamed from: eS */
    public final void mo6409eS(int i, C3036as asVar, C3027aj ajVar, C3032ao aoVar) {
        C2711b aj = m7430aj(i, asVar);
        mo6404ah(aj, 1000, new C2698an(aj));
    }

    /* renamed from: eT */
    public final void mo6410eT(int i, C3036as asVar, C3032ao aoVar) {
        C2711b aj = m7430aj(i, asVar);
        mo6404ah(aj, 1005, new C2734e(aj));
    }

    /* renamed from: f */
    public final void mo6231f(int i, boolean z) {
        mo6404ah(mo6401ae(), 30, new C2754y());
    }

    /* renamed from: g */
    public final void mo6232g(C2646bh bhVar, C2643be beVar) {
    }

    /* renamed from: h */
    public final void mo6233h(boolean z) {
        C2711b ae = mo6401ae();
        mo6404ah(ae, 3, new C2720bi(ae));
    }

    /* renamed from: i */
    public final void mo6234i(boolean z) {
        mo6404ah(mo6401ae(), 7, new C2700ap());
    }

    /* renamed from: j */
    public final void mo6235j(boolean z) {
    }

    /* renamed from: k */
    public final void mo6236k(C2590aq aqVar, int i) {
        mo6404ah(mo6401ae(), 1, new C2704at());
    }

    /* renamed from: l */
    public final void mo6237l(C2593at atVar) {
        mo6404ah(mo6401ae(), 14, new C2707aw());
    }

    /* renamed from: m */
    public final void mo6238m(Metadata metadata) {
        C2711b ae = mo6401ae();
        mo6404ah(ae, 28, new C2694aj(ae, metadata));
    }

    /* renamed from: n */
    public final void mo6239n(boolean z, int i) {
        mo6404ah(mo6401ae(), 5, new C2699ao());
    }

    /* renamed from: o */
    public final void mo6240o(C2640bb bbVar) {
        C2711b ae = mo6401ae();
        mo6404ah(ae, 12, new C2740k(ae, bbVar));
    }

    /* renamed from: p */
    public final void mo6241p(int i) {
        mo6404ah(mo6401ae(), 4, new C2703as());
    }

    /* renamed from: q */
    public final void mo6242q(int i) {
        C2711b ae = mo6401ae();
        mo6404ah(ae, 6, new C2719bh(ae, i));
    }

    /* renamed from: r */
    public final void mo6243r(C2639ba baVar) {
        C2711b am = m7433am(baVar);
        mo6404ah(am, 10, new C2693ai(am, baVar));
    }

    /* renamed from: s */
    public final void mo6244s(C2639ba baVar) {
        mo6404ah(m7433am(baVar), 10, new C2706av());
    }

    /* renamed from: t */
    public final void mo6245t(boolean z, int i) {
        C2711b ae = mo6401ae();
        mo6404ah(ae, -1, new C2735f(ae, z, i));
    }

    /* renamed from: u */
    public final void mo6246u(int i) {
    }

    /* renamed from: w */
    public final void mo6248w() {
    }

    /* renamed from: x */
    public final void mo6249x(int i) {
        mo6404ah(mo6401ae(), 8, new C2744o());
    }

    /* renamed from: y */
    public final void mo6250y() {
        mo6404ah(mo6401ae(), -1, new C2742m());
    }

    /* renamed from: z */
    public final void mo6251z(boolean z) {
        mo6404ah(mo6401ae(), 9, new C2702ar());
    }

    /* renamed from: ai */
    private final C2711b m7429ai(C3036as asVar) {
        this.f7558g.getClass();
        C2651bm a = asVar == null ? null : this.f7557f.mo6399a(asVar);
        if (asVar != null && a != null) {
            return mo6402af(a, a.mo6303n(asVar.f7204a, this.f7555d).f7330c, asVar);
        }
        int c = this.f7558g.mo5996c();
        C2651bm u = this.f7558g.mo6014u();
        if (c >= u.mo6022c()) {
            u = C2651bm.f7353c;
        }
        return mo6402af(u, c, (C3036as) null);
    }

    /* renamed from: v */
    public final void mo6247v(C2645bg bgVar, C2645bg bgVar2, int i) {
        if (i == 1) {
            this.f7560i = false;
            i = 1;
        }
        C2722bk bkVar = this.f7557f;
        C2646bh bhVar = this.f7558g;
        bhVar.getClass();
        bkVar.f7548c = C2722bk.m7424b(bhVar, bkVar.f7547b, bkVar.f7549d, bkVar.f7546a);
        C2711b ae = mo6401ae();
        mo6404ah(ae, 11, new C2749t(ae, i, bgVar, bgVar2));
    }

    /* renamed from: C */
    public final void mo6222C(C2651bm bmVar, int i) {
        C2722bk bkVar = this.f7557f;
        C2646bh bhVar = this.f7558g;
        bhVar.getClass();
        bkVar.f7548c = C2722bk.m7424b(bhVar, bkVar.f7547b, bkVar.f7549d, bkVar.f7546a);
        bkVar.mo6400c(bhVar.mo6014u());
        C2711b ae = mo6401ae();
        mo6404ah(ae, 0, new C2689ae(ae));
    }

    public C2723bl(C2616d dVar) {
        dVar.getClass();
        this.f7554c = dVar;
        this.f7553b = new C2632t(C2612ak.m6923F(), dVar, C2741l.f7620a);
        C2649bk bkVar = new C2649bk();
        this.f7555d = bkVar;
        this.f7557f = new C2722bk(bkVar);
        this.f7552a = new SparseArray();
    }
}
