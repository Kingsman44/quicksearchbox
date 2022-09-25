package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8153a;

import android.animation.TimeAnimator;
import android.support.p033v7.widget.C0568ck;
import android.support.p033v7.widget.C0673gh;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105659y;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.a.b */
/* compiled from: PG */
public final class C105472b extends C0568ck {

    /* renamed from: n */
    public final TimeAnimator f294161n = new TimeAnimator();

    /* renamed from: o */
    public boolean f294162o = false;

    /* renamed from: p */
    public final C105659y f294163p;

    public C105472b(C105659y yVar) {
        this.f294163p = yVar;
    }

    /* renamed from: f */
    public final boolean mo2690f(C0673gh ghVar) {
        boolean f = super.mo2690f(ghVar);
        mo94824x();
        return f;
    }

    /* renamed from: g */
    public final boolean mo2691g(C0673gh ghVar, C0673gh ghVar2, int i, int i2, int i3, int i4) {
        boolean g = super.mo2691g(ghVar, ghVar2, i, i2, i3, i4);
        mo94824x();
        return g;
    }

    /* renamed from: h */
    public final boolean mo2692h(C0673gh ghVar, int i, int i2, int i3, int i4) {
        this.f294161n.start();
        boolean h = super.mo2692h(ghVar, i, i2, i3, i4);
        mo94824x();
        return h;
    }

    /* renamed from: i */
    public final boolean mo2693i(C0673gh ghVar) {
        boolean i = super.mo2693i(ghVar);
        mo94824x();
        return i;
    }

    /* renamed from: x */
    public final void mo94824x() {
        if (!this.f294162o) {
            this.f294162o = true;
            mo2896t(new C105471a(this));
            C105659y yVar = this.f294163p;
            yVar.f294772a.mo94833O(false);
            yVar.f294772a.f294205m = true;
        }
    }
}
