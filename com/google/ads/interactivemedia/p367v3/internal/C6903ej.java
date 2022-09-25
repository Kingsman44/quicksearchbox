package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ej */
/* compiled from: PG */
public final class C6903ej extends C6819bg implements C6890dx {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C7022iu f21991A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f21992B;

    /* renamed from: C */
    private final C6966gs f21993C;

    /* renamed from: D */
    private final float f21994D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f21995E;

    /* renamed from: F */
    private final boolean f21996F;

    /* renamed from: G */
    private boolean f21997G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C7025ix f21998H;

    /* renamed from: I */
    private final ary f21999I = null;

    /* renamed from: b */
    protected final C6897ed[] f22000b;

    /* renamed from: c */
    private final C6849cj f22001c;

    /* renamed from: d */
    private final C6902ei f22002d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final CopyOnWriteArraySet f22003e;

    /* renamed from: f */
    private final CopyOnWriteArraySet f22004f;

    /* renamed from: g */
    private final CopyOnWriteArraySet f22005g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final CopyOnWriteArraySet f22006h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final CopyOnWriteArraySet f22007i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final CopyOnWriteArraySet f22008j;

    /* renamed from: k */
    private final C6957gj f22009k;

    /* renamed from: l */
    private final C6814bb f22010l;

    /* renamed from: m */
    private final C6818bf f22011m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C6908eo f22012n;

    /* renamed from: o */
    private final C6913et f22013o;

    /* renamed from: p */
    private final C6914eu f22014p;

    /* renamed from: q */
    private final long f22015q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C6864cy f22016r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6864cy f22017s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Surface f22018t;

    /* renamed from: u */
    private boolean f22019u;

    /* renamed from: v */
    private final int f22020v;

    /* renamed from: w */
    private SurfaceHolder f22021w;

    /* renamed from: x */
    private int f22022x;

    /* renamed from: y */
    private int f22023y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C7022iu f22024z;

    @Deprecated
    protected C6903ej(Context context, aok aok, abf abf, C7334ui uiVar, C6823bk bkVar, abq abq, C6957gj gjVar, adk adk, Looper looper) {
        C6901eh ehVar = new C6901eh(context, aok);
        ehVar.mo15796w(abf);
        ehVar.mo15795v(uiVar);
        ehVar.mo15793t(bkVar);
        ehVar.mo15791r(abq);
        ehVar.mo15790q(gjVar);
        ehVar.mo15797x();
        ehVar.mo15792s(adk);
        ehVar.mo15794u(looper);
        C6957gj a = ehVar.f21978f;
        this.f22009k = a;
        C6966gs b = ehVar.f21980h;
        this.f21993C = b;
        this.f22020v = 1;
        this.f21995E = false;
        this.f22015q = 2000;
        C6902ei eiVar = new C6902ei(this);
        this.f22002d = eiVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f22003e = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        this.f22004f = copyOnWriteArraySet2;
        new CopyOnWriteArraySet();
        CopyOnWriteArraySet copyOnWriteArraySet3 = new CopyOnWriteArraySet();
        this.f22005g = copyOnWriteArraySet3;
        this.f22006h = new CopyOnWriteArraySet();
        CopyOnWriteArraySet copyOnWriteArraySet4 = new CopyOnWriteArraySet();
        this.f22007i = copyOnWriteArraySet4;
        CopyOnWriteArraySet copyOnWriteArraySet5 = new CopyOnWriteArraySet();
        this.f22008j = copyOnWriteArraySet5;
        Handler handler = new Handler(ehVar.f21979g);
        C6897ed[] a2 = ehVar.f21987o.mo15120a(handler, eiVar, eiVar);
        this.f22000b = a2;
        this.f21994D = 1.0f;
        this.f21992B = 0;
        Collections.emptyList();
        this.f21996F = true;
        abf f = ehVar.f21975c;
        C6823bk o = ehVar.f21988p;
        abq g = ehVar.f21977e;
        boolean h = ehVar.f21982j;
        C6900eg i = ehVar.f21983k;
        C6822bj p = ehVar.f21989q;
        adk k = ehVar.f21974b;
        Looper e = ehVar.f21979g;
        C6849cj cjVar = r2;
        C6901eh ehVar2 = ehVar;
        C6957gj gjVar2 = a;
        C6849cj cjVar2 = new C6849cj(a2, f, o, g, a, h, i, p, 500, false, k, e);
        this.f22001c = cjVar2;
        C6902ei eiVar2 = eiVar;
        cjVar2.mo15557e(eiVar2);
        copyOnWriteArraySet4.add(gjVar2);
        copyOnWriteArraySet.add(gjVar2);
        copyOnWriteArraySet5.add(gjVar2);
        copyOnWriteArraySet2.add(gjVar2);
        ary.m19467t(gjVar2);
        copyOnWriteArraySet3.add(gjVar2);
        Handler handler2 = handler;
        C6814bb bbVar = new C6814bb(ehVar2.f21973a, handler2, eiVar2);
        this.f22010l = bbVar;
        bbVar.mo15492a(false);
        C6818bf bfVar = new C6818bf(ehVar2.f21973a, handler2, eiVar2);
        this.f22011m = bfVar;
        bfVar.mo15496b((C6966gs) null);
        C6908eo eoVar = new C6908eo(ehVar2.f21973a, handler2, eiVar2);
        this.f22012n = eoVar;
        C6966gs gsVar = b;
        int i2 = gsVar.f22226c;
        int i3 = aeu.f20466a;
        eoVar.mo15827a(3);
        C6913et etVar = new C6913et(ehVar2.f21973a);
        this.f22013o = etVar;
        etVar.mo15857a(false);
        C6914eu euVar = new C6914eu(ehVar2.f21973a);
        this.f22014p = euVar;
        euVar.mo15859a(false);
        this.f21998H = m20271af(eoVar);
        m20270ae(1, 3, gsVar);
        m20270ae(2, 4, 1);
        m20270ae(1, 101, Boolean.valueOf(this.f21995E));
    }

    /* renamed from: C */
    static /* synthetic */ void m20243C(C6903ej ejVar) {
        Iterator it = ejVar.f22004f.iterator();
        while (it.hasNext()) {
            C6968gu guVar = (C6968gu) it.next();
            if (!ejVar.f22008j.contains(guVar)) {
                guVar.mo15812z(ejVar.f21992B);
            }
        }
        Iterator it2 = ejVar.f22008j.iterator();
        while (it2.hasNext()) {
            ((C6983hi) it2.next()).mo15812z(ejVar.f21992B);
        }
    }

    /* renamed from: E */
    static /* synthetic */ void m20245E(C6903ej ejVar) {
        Iterator it = ejVar.f22004f.iterator();
        while (it.hasNext()) {
            C6968gu guVar = (C6968gu) it.next();
            if (!ejVar.f22008j.contains(guVar)) {
                guVar.mo15803F(ejVar.f21995E);
            }
        }
        Iterator it2 = ejVar.f22008j.iterator();
        while (it2.hasNext()) {
            ((C6983hi) it2.next()).mo15803F(ejVar.f21995E);
        }
    }

    /* renamed from: O */
    static /* synthetic */ boolean m20255O(C6903ej ejVar) {
        return false;
    }

    /* renamed from: P */
    static /* synthetic */ void m20256P(C6903ej ejVar) {
        int g = ejVar.mo15819g();
        boolean z = true;
        if (g != 1) {
            if (g == 2 || g == 3) {
                ejVar.m20269ad();
                boolean c = ejVar.f22001c.mo15555c();
                C6913et etVar = ejVar.f22013o;
                if (!ejVar.mo15822j() || c) {
                    z = false;
                }
                etVar.mo15858b(z);
                ejVar.f22014p.mo15860b(ejVar.mo15822j());
                return;
            } else if (g != 4) {
                throw new IllegalStateException();
            }
        }
        ejVar.f22013o.mo15858b(false);
        ejVar.f22014p.mo15860b(false);
    }

    /* renamed from: Y */
    static /* synthetic */ ary m20264Y(C6903ej ejVar) {
        return null;
    }

    /* renamed from: Z */
    private final void m20265Z() {
        SurfaceHolder surfaceHolder = this.f22021w;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f22002d);
            this.f22021w = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aa */
    public final void m20266aa(Surface surface, boolean z) {
        ArrayList<C6894ea> arrayList = new ArrayList<>();
        C6897ed[] edVarArr = this.f22000b;
        int length = edVarArr.length;
        for (int i = 0; i < 2; i++) {
            C6897ed edVar = edVarArr[i];
            if (edVar.mo15509a() == 2) {
                C6894ea k = this.f22001c.mo15563k(edVar);
                k.mo15778o(1);
                k.mo15777n(surface);
                k.mo15776m();
                arrayList.add(k);
            }
        }
        Surface surface2 = this.f22018t;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (C6894ea k2 : arrayList) {
                    k2.mo15774k(this.f22015q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f22001c.mo15553B(C6826bn.m19784e(new TimeoutException("Detaching surface timed out."), 3));
            }
            if (this.f22019u) {
                this.f22018t.release();
            }
        }
        this.f22018t = surface;
        this.f22019u = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: ab */
    public final void m20267ab(int i, int i2) {
        if (i != this.f22022x || i2 != this.f22023y) {
            this.f22022x = i;
            this.f22023y = i2;
            Iterator it = this.f22003e.iterator();
            while (it.hasNext()) {
                ((afk) it.next()).mo14667M(i, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ac */
    public final void m20268ac(boolean z, int i, int i2) {
        boolean z2;
        int i3 = 1;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            z2 = false;
            i = -1;
        }
        if (!z2 || i == 1) {
            i3 = 0;
        }
        this.f22001c.mo15560h(z2, i3, i2);
    }

    /* renamed from: ad */
    private final void m20269ad() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() == this.f22001c.mo15556d()) {
            return;
        }
        if (!this.f21996F) {
            if (this.f21997G) {
                illegalStateException = null;
            } else {
                illegalStateException = new IllegalStateException();
            }
            adu.m18340a("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
            this.f21997G = true;
            return;
        }
        throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
    }

    /* access modifiers changed from: private */
    /* renamed from: ae */
    public final void m20270ae(int i, int i2, Object obj) {
        C6897ed[] edVarArr = this.f22000b;
        int length = edVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            C6897ed edVar = edVarArr[i3];
            if (edVar.mo15509a() == i) {
                C6894ea k = this.f22001c.mo15563k(edVar);
                k.mo15778o(i2);
                k.mo15777n(obj);
                k.mo15776m();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: af */
    public static C7025ix m20271af(C6908eo eoVar) {
        return new C7025ix(eoVar.mo15828b(), eoVar.mo15829c());
    }

    /* access modifiers changed from: private */
    /* renamed from: ag */
    public static int m20272ag(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: A */
    public final void mo15552A() {
        m20269ad();
        this.f22011m.mo15497c(mo15822j(), 1);
        this.f22001c.mo15552A();
        Collections.emptyList();
    }

    /* renamed from: X */
    public final void mo15813X() {
        m20269ad();
        m20265Z();
        m20266aa((Surface) null, false);
        m20267ab(0, 0);
    }

    /* renamed from: b */
    public final void mo15814b(SurfaceHolder surfaceHolder) {
        m20269ad();
        m20265Z();
        if (surfaceHolder != null) {
            m20269ad();
            m20270ae(2, 8, (Object) null);
        }
        this.f22021w = surfaceHolder;
        if (surfaceHolder == null) {
            m20266aa((Surface) null, false);
            m20267ab(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f22002d);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m20266aa((Surface) null, false);
            m20267ab(0, 0);
            return;
        }
        m20266aa(surface, false);
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        m20267ab(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: c */
    public final void mo15815c(C6959gl glVar) {
        ary.m19467t(glVar);
        this.f22009k.mo15877G(glVar);
    }

    /* renamed from: d */
    public final void mo15816d(C6959gl glVar) {
        this.f22009k.mo15878H(glVar);
    }

    /* renamed from: e */
    public final void mo15817e(afk afk) {
        ary.m19467t(afk);
        this.f22003e.add(afk);
    }

    /* renamed from: f */
    public final void mo15818f(afk afk) {
        this.f22003e.remove(afk);
    }

    /* renamed from: g */
    public final int mo15819g() {
        m20269ad();
        return this.f22001c.mo15558f();
    }

    @Deprecated
    /* renamed from: h */
    public final void mo15820h(C7323ty tyVar) {
        m20269ad();
        List singletonList = Collections.singletonList(tyVar);
        m20269ad();
        this.f22001c.mo15577z(singletonList);
        m20269ad();
        boolean j = mo15822j();
        int c = this.f22011m.mo15497c(j, 2);
        m20268ac(j, c, m20272ag(j, c));
        this.f22001c.mo15559g();
    }

    /* renamed from: i */
    public final void mo15821i(boolean z) {
        m20269ad();
        int c = this.f22011m.mo15497c(z, mo15819g());
        m20268ac(z, c, m20272ag(z, c));
    }

    /* renamed from: j */
    public final boolean mo15822j() {
        m20269ad();
        return this.f22001c.mo15561i();
    }

    /* renamed from: k */
    public final void mo15823k() {
        m20269ad();
        this.f22010l.mo15492a(false);
        this.f22012n.mo15830d();
        this.f22013o.mo15858b(false);
        this.f22014p.mo15860b(false);
        this.f22011m.mo15498d();
        this.f22001c.mo15562j();
        m20265Z();
        Surface surface = this.f22018t;
        if (surface != null) {
            if (this.f22019u) {
                surface.release();
            }
            this.f22018t = null;
        }
        Collections.emptyList();
    }

    /* renamed from: l */
    public final int mo15564l() {
        throw null;
    }

    /* renamed from: m */
    public final int mo15565m() {
        m20269ad();
        return this.f22001c.mo15565m();
    }

    /* renamed from: n */
    public final long mo15824n() {
        m20269ad();
        return this.f22001c.mo15566n();
    }

    /* renamed from: o */
    public final long mo15567o() {
        m20269ad();
        return this.f22001c.mo15567o();
    }

    /* renamed from: p */
    public final long mo15568p() {
        throw null;
    }

    /* renamed from: q */
    public final boolean mo15569q() {
        throw null;
    }

    /* renamed from: r */
    public final int mo15570r() {
        throw null;
    }

    /* renamed from: s */
    public final int mo15571s() {
        throw null;
    }

    /* renamed from: t */
    public final long mo15572t() {
        throw null;
    }

    /* renamed from: u */
    public final C6912es mo15573u() {
        throw null;
    }

    /* renamed from: y */
    public final void mo15576y(int i) {
        m20269ad();
        this.f22009k.mo15881K();
        this.f22001c.mo15576y(i);
    }
}
