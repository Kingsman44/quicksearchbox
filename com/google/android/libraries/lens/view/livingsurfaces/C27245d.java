package com.google.android.libraries.lens.view.livingsurfaces;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.view.gleam.C26447af;
import com.google.android.libraries.lens.view.gleam.C26461at;
import com.google.android.libraries.lens.view.gleam.C26492bx;
import com.google.android.libraries.lens.view.p2073ao.C25459e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2146j.C27212a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.p4552o.adn;
import com.google.common.p4552o.ado;
import com.google.common.p4552o.aly;
import com.google.common.p4552o.alz;
import com.google.common.p4552o.p4563i.C59866ab;
import com.google.common.p4552o.p4563i.C59975y;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.d */
/* compiled from: PG */
public abstract class C27245d implements C27259r {

    /* renamed from: a */
    final C27270x f74530a;

    /* renamed from: b */
    public final C27268v f74531b;

    /* renamed from: c */
    private final C27251j f74532c;

    /* renamed from: e */
    private final C37215b f74533e;

    /* renamed from: f */
    private final C28310af f74534f;

    /* renamed from: g */
    private final C28443m f74535g;

    /* renamed from: h */
    private final C28306ab f74536h;

    /* renamed from: i */
    private final C27250i f74537i = new C27244c(this);

    /* renamed from: j */
    private boolean f74538j;

    /* renamed from: k */
    private boolean f74539k;

    protected C27245d(View view, FrameLayout.LayoutParams layoutParams, C27251j jVar, C37215b bVar, C25459e eVar, C27268v vVar, C28310af afVar, C28443m mVar, C28306ab abVar) {
        C27270x xVar = new C27270x(((C27233a) vVar).f74494a);
        this.f74530a = xVar;
        xVar.mo32801c(view, layoutParams);
        xVar.f74583d = eVar;
        this.f74532c = jVar;
        this.f74533e = bVar;
        this.f74531b = vVar;
        this.f74534f = afVar;
        this.f74535g = mVar;
        this.f74536h = abVar;
    }

    /* renamed from: b */
    public static FrameLayout.LayoutParams m50630b(float f) {
        float sqrt = (float) Math.sqrt((double) (300000.0f / f));
        return new FrameLayout.LayoutParams((int) (f * sqrt), (int) sqrt);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo32762a() {
        return 72042;
    }

    /* renamed from: c */
    public final void mo32763c(FrameLayout frameLayout) {
        frameLayout.addView(this.f74530a, new FrameLayout.LayoutParams(-1, -1));
        C28306ab abVar = this.f74536h;
        C27270x xVar = this.f74530a;
        C28313c a = this.f74534f.mo33805a(C28427h.m53115a(mo32762a()));
        adn adn = (adn) ado.f158388g.createBuilder();
        C59975y yVar = (C59975y) C59866ab.f161790e.createBuilder();
        aly aly = (aly) alz.f159118c.createBuilder();
        String str = ((C27233a) this.f74531b).f74495b;
        aly.copyOnWrite();
        alz alz = (alz) aly.instance;
        alz.f159120a |= 1;
        alz.f159121b = str;
        yVar.copyOnWrite();
        C59866ab abVar2 = (C59866ab) yVar.instance;
        alz alz2 = (alz) aly.build();
        alz2.getClass();
        abVar2.f161793b = alz2;
        abVar2.f161792a |= 4;
        adn.copyOnWrite();
        ado ado = (ado) adn.instance;
        C59866ab abVar3 = (C59866ab) yVar.build();
        abVar3.getClass();
        ado.f158392b = abVar3;
        ado.f158391a |= 1;
        a.mo33858f(new C28353e(C25686g.f69825a, (ado) adn.build()));
        abVar.mo33801b(xVar, a);
        this.f74532c.mo32776a(this.f74537i);
        this.f74533e.mo19974a(C37194a.f98444aG);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo32764d();

    /* renamed from: e */
    public final void mo32765e() {
        mo32764d();
        this.f74532c.mo32780e(this.f74537i);
        ((ViewGroup) this.f74530a.getParent()).removeView(this.f74530a);
        this.f74533e.mo19974a(C37194a.f98445aH);
    }

    /* renamed from: f */
    public final void mo32766f(Canvas canvas, C62491dn dnVar) {
        this.f74530a.mo32800a(canvas, dnVar);
    }

    /* renamed from: g */
    public final void mo32767g() {
        if (!this.f74530a.f74582c) {
            this.f74533e.mo19974a(C37194a.f98448aK);
            mo32771k();
        }
    }

    /* renamed from: h */
    public final void mo32768h() {
        this.f74535g.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f74530a));
        this.f74533e.mo19974a(C37194a.f98446aI);
    }

    /* renamed from: i */
    public final void mo32769i() {
        if (!this.f74539k) {
            this.f74533e.mo19974a(C37194a.f98449aL);
            this.f74539k = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo32770j(boolean z);

    /* renamed from: k */
    public final void mo32771k() {
        C27270x xVar = this.f74530a;
        if (!xVar.f74582c) {
            xVar.f74582c = true;
            View view = xVar.f74580a;
            if (view != null) {
                view.setVisibility(0);
                C27270x.m50775b(xVar.f74580a, 0.0f, 1.0f);
            }
            C27243b bVar = xVar.f74581b;
            if (bVar != null) {
                C27270x.m50775b(bVar, bVar.getAlpha(), 0.0f);
            }
            C27262u uVar = ((C27233a) this.f74531b).f74500g;
            C26492bx bxVar = (C26492bx) uVar;
            bxVar.f72174w = (float) ((C26447af) uVar).mo31676t();
            C26461at atVar = (C26461at) uVar;
            bxVar.f72175x = C27212a.m50465a(atVar.f72070t.mo31834a(atVar.mo31702D()).getAlpha());
        }
    }

    /* renamed from: l */
    public final void mo32772l() {
        if (!this.f74538j) {
            this.f74533e.mo19974a(C37194a.f98447aJ);
            mo32770j(!((C27233a) this.f74531b).f74499f || this.f74532c.mo32785j());
            mo32773m();
            this.f74538j = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo32773m();

    /* renamed from: n */
    public final boolean mo32774n() {
        return this.f74530a.getParent() != null;
    }

    /* renamed from: o */
    public final boolean mo32775o() {
        return this.f74530a.f74582c;
    }
}
