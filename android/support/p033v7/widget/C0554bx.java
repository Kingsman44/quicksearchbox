package android.support.p033v7.widget;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.bx */
/* compiled from: PG */
public final class C0554bx implements C0621ej {

    /* renamed from: a */
    public final C0552bv f2151a;

    /* renamed from: b */
    public final C0762jp f2152b;

    /* renamed from: c */
    public final List f2153c = new ArrayList();

    /* renamed from: d */
    public final IdentityHashMap f2154d = new IdentityHashMap();

    /* renamed from: e */
    public final List f2155e = new ArrayList();

    /* renamed from: f */
    public final C0718hz f2156f;

    /* renamed from: g */
    private C0553bw f2157g = new C0553bw();

    /* renamed from: h */
    private final int f2158h;

    public C0554bx(C0552bv bvVar, C0551bu buVar) {
        this.f2151a = bvVar;
        if (buVar.f2145b) {
            this.f2152b = new C0758jl();
        } else {
            this.f2152b = new C0760jn();
        }
        int i = buVar.f2146c;
        this.f2158h = i;
        this.f2156f = i == 1 ? new C0714hv() : i == 2 ? new C0712ht() : new C0716hx();
    }

    /* renamed from: a */
    public final int mo2625a(C0622ek ekVar) {
        C0622ek ekVar2;
        Iterator it = this.f2155e.iterator();
        int i = 0;
        while (it.hasNext() && (ekVar2 = (C0622ek) it.next()) != ekVar) {
            i += ekVar2.f2383e;
        }
        return i;
    }

    /* renamed from: b */
    public final int mo2626b() {
        int i = 0;
        for (C0622ek ekVar : this.f2155e) {
            i += ekVar.f2383e;
        }
        return i;
    }

    /* renamed from: c */
    public final C0553bw mo2627c(int i) {
        C0553bw bwVar = this.f2157g;
        if (bwVar.f2150c) {
            bwVar = new C0553bw();
        } else {
            bwVar.f2150c = true;
        }
        Iterator it = this.f2155e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0622ek ekVar = (C0622ek) it.next();
            int i3 = ekVar.f2383e;
            if (i3 > i2) {
                bwVar.f2148a = ekVar;
                bwVar.f2149b = i2;
                break;
            }
            i2 -= i3;
        }
        if (bwVar.f2148a != null) {
            return bwVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    /* renamed from: d */
    public final C0622ek mo2628d(C0673gh ghVar) {
        C0622ek ekVar = (C0622ek) this.f2154d.get(ghVar);
        if (ekVar != null) {
            return ekVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + ghVar + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: e */
    public final void mo2629e() {
        int i;
        Iterator it = this.f2155e.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            C0622ek ekVar = (C0622ek) it.next();
            int i2 = ekVar.f2381c.mStateRestorationPolicy$ar$edu;
            i = 3;
            if (i2 == 3 || (i2 == 2 && ekVar.f2383e == 0)) {
                break;
            }
        }
        C0552bv bvVar = this.f2151a;
        if (i != bvVar.mStateRestorationPolicy$ar$edu) {
            bvVar.mStateRestorationPolicy$ar$edu = i;
            bvVar.mObservable.mo2884f();
        }
    }

    /* renamed from: f */
    public final void mo2630f(C0622ek ekVar, int i, int i2, Object obj) {
        this.f2151a.mObservable.mo2881c(i + mo2625a(ekVar), i2, obj);
    }

    /* renamed from: g */
    public final void mo2631g(C0553bw bwVar) {
        bwVar.f2150c = false;
        bwVar.f2148a = null;
        bwVar.f2149b = -1;
        this.f2157g = bwVar;
    }

    /* renamed from: h */
    public final boolean mo2632h() {
        return this.f2158h != 1;
    }
}
