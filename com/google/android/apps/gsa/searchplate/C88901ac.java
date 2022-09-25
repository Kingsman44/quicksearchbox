package com.google.android.apps.gsa.searchplate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.searchplate.p6963a.C88897g;
import com.google.android.apps.gsa.searchplate.p6966d.C88936h;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchplate.ac */
/* compiled from: PG */
public final class C88901ac extends AnimatorListenerAdapter implements LayoutTransition.TransitionListener {

    /* renamed from: a */
    public C88936h f240802a = null;

    /* renamed from: b */
    public boolean f240803b;

    /* renamed from: c */
    public boolean f240804c;

    /* renamed from: d */
    public int f240805d;

    /* renamed from: e */
    public int f240806e;

    /* renamed from: f */
    public boolean f240807f;

    /* renamed from: g */
    public boolean f240808g;

    /* renamed from: h */
    public final /* synthetic */ SearchPlate f240809h;

    /* renamed from: i */
    private final LayoutTransition f240810i;

    /* renamed from: j */
    private int f240811j = 0;

    /* renamed from: k */
    private int f240812k;

    /* renamed from: l */
    private String f240813l;

    /* renamed from: m */
    private String f240814m;

    /* renamed from: n */
    private Spanned f240815n = null;

    /* renamed from: o */
    private boolean f240816o;

    /* renamed from: p */
    private boolean f240817p;

    /* renamed from: q */
    private boolean f240818q;

    /* renamed from: r */
    private boolean f240819r;

    /* renamed from: s */
    private boolean f240820s;

    /* renamed from: t */
    private int f240821t;

    /* renamed from: u */
    private int f240822u;

    /* renamed from: v */
    private boolean f240823v;

    public C88901ac(SearchPlate searchPlate, ViewGroup viewGroup) {
        this.f240809h = searchPlate;
        viewGroup.getLayoutTransition().addTransitionListener(this);
        this.f240810i = viewGroup.getLayoutTransition();
        m144494l();
    }

    /* renamed from: l */
    private final void m144494l() {
        this.f240810i.disableTransitionType(4);
        this.f240810i.disableTransitionType(2);
        this.f240810i.disableTransitionType(3);
        this.f240810i.disableTransitionType(0);
        this.f240810i.disableTransitionType(1);
    }

    /* renamed from: a */
    public final int mo82755a() {
        return this.f240816o ? this.f240821t : this.f240809h.f240685E;
    }

    /* renamed from: b */
    public final void mo82756b() {
        this.f240818q = false;
        if (mo82766k()) {
            this.f240819r = true;
            return;
        }
        this.f240809h.mo82670d(true);
        this.f240819r = false;
    }

    /* renamed from: c */
    public final void mo82757c(int i, String str, String str2) {
        if (mo82766k()) {
            this.f240817p = true;
            this.f240812k = i;
            this.f240813l = str;
            this.f240814m = str2;
            return;
        }
        this.f240809h.mo82679l(i, str, str2, true);
        this.f240817p = false;
    }

    /* renamed from: d */
    public final void mo82758d(C88936h hVar) {
        if (mo82766k()) {
            this.f240802a = hVar;
            return;
        }
        this.f240809h.mo82681n(hVar, true);
        this.f240802a = null;
    }

    /* renamed from: e */
    public final void mo82759e(int i, int i2, boolean z) {
        if (mo82766k()) {
            if (this.f240816o) {
                this.f240804c = false;
            }
            this.f240816o = true;
            this.f240821t = i;
            this.f240822u = i2;
            this.f240823v = z;
            return;
        }
        this.f240809h.mo82680m(i, i2, true, z);
        this.f240816o = false;
        if (this.f240804c) {
            this.f240803b = true;
            this.f240805d = this.f240806e;
            this.f240804c = false;
        }
    }

    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.f240811j--;
        C58976aa aaVar = C58975e.f156826a;
        mo82764i();
    }

    /* renamed from: f */
    public final void mo82761f(Spanned spanned) {
        if (mo82766k()) {
            this.f240815n = spanned;
            return;
        }
        this.f240809h.mo82689q(spanned, true);
        this.f240815n = null;
    }

    /* renamed from: g */
    public final void mo82762g(int i) {
        if (!mo82766k()) {
            this.f240809h.mo82692s(i, true);
            this.f240803b = false;
        } else if (this.f240816o) {
            this.f240804c = true;
            this.f240806e = i;
        } else {
            this.f240803b = true;
            this.f240805d = i;
        }
    }

    /* renamed from: h */
    public final void mo82763h() {
        this.f240819r = false;
        if (mo82766k()) {
            this.f240818q = true;
            return;
        }
        this.f240809h.mo82693t(true);
        this.f240818q = false;
    }

    /* renamed from: i */
    public final void mo82764i() {
        C58976aa aaVar = C58975e.f156826a;
        if (!mo82766k() && !this.f240820s) {
            this.f240820s = true;
            boolean z = true ^ this.f240816o;
            if (this.f240803b) {
                mo82762g(this.f240805d);
            }
            if (this.f240816o) {
                mo82759e(this.f240821t, this.f240822u, this.f240823v);
            }
            C88936h hVar = this.f240802a;
            if (hVar != null) {
                mo82758d(hVar);
            }
            if (this.f240817p) {
                mo82757c(this.f240812k, this.f240813l, this.f240814m);
            }
            if (this.f240818q) {
                mo82763h();
            }
            if (this.f240819r) {
                mo82756b();
            }
            Spanned spanned = this.f240815n;
            if (spanned != null) {
                mo82761f(spanned);
            }
            this.f240820s = false;
            if (z) {
                for (C88897g b : this.f240809h.f240732e) {
                    b.mo81838b();
                }
            }
            if (!this.f240816o) {
                for (C88897g n : this.f240809h.f240732e) {
                    n.mo82752n();
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo82765j(boolean z) {
        boolean z2 = z & (!C90772bp.m148283J(this.f240809h.getContext()));
        C58976aa aaVar = C58975e.f156826a;
        if (z2 && !this.f240807f) {
            this.f240810i.enableTransitionType(4);
            this.f240810i.enableTransitionType(2);
            this.f240810i.enableTransitionType(3);
            this.f240810i.enableTransitionType(0);
            this.f240810i.enableTransitionType(1);
        } else if (this.f240807f) {
            m144494l();
        }
        this.f240807f = z2;
    }

    /* renamed from: k */
    public final boolean mo82766k() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f240809h.getLayoutTransition().isRunning()) {
            return true;
        }
        SearchPlate searchPlate = this.f240809h;
        return searchPlate.f240734g.f240775g || searchPlate.isLayoutRequested() || this.f240808g;
    }

    public final void onAnimationEnd(Animator animator) {
        mo82764i();
    }

    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        this.f240811j++;
        C58976aa aaVar = C58975e.f156826a;
    }
}
