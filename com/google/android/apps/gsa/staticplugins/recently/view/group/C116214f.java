package com.google.android.apps.gsa.staticplugins.recently.view.group;

import android.view.View;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.view.group.f */
/* compiled from: PG */
public final class C116214f {

    /* renamed from: a */
    public final int f322252a;

    /* renamed from: b */
    public final float f322253b;

    /* renamed from: c */
    public final C116213e f322254c;

    /* renamed from: d */
    public final float f322255d;

    /* renamed from: e */
    public int f322256e;

    /* renamed from: f */
    public C116212d f322257f;

    /* renamed from: g */
    public View f322258g;

    /* renamed from: h */
    public final C147446j f322259h;

    /* renamed from: i */
    public final C147446j f322260i;

    /* renamed from: j */
    public int f322261j;

    /* renamed from: k */
    public int f322262k;

    /* renamed from: l */
    public float f322263l;

    /* renamed from: m */
    public final C147446j f322264m;

    public C116214f(int i, int i2, float f, C116213e eVar, float f2) {
        C147446j jVar = new C147446j(0.0f);
        jVar.f397996b = new C147454r(200.0f, 0.8f);
        this.f322259h = jVar;
        C147446j jVar2 = new C147446j(0.0f);
        jVar2.f397996b = new C147454r(200.0f, 0.8f);
        this.f322260i = jVar2;
        C147446j jVar3 = new C147446j(0.0f);
        jVar3.f397996b = new C147454r(200.0f, 0.8f);
        this.f322264m = jVar3;
        this.f322256e = i;
        this.f322252a = i2;
        this.f322253b = f;
        this.f322254c = eVar;
        this.f322255d = f2;
        C116210b bVar = new C116210b(this);
        jVar.mo124188n(bVar);
        jVar2.mo124188n(bVar);
        jVar3.mo124188n(new C116211c(this));
    }

    /* renamed from: a */
    public final float mo102604a(float f) {
        return Math.max(0.0f, Math.min((-f) / 2.0f, this.f322255d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo102605b(View view) {
        this.f322258g = view;
        if (view != null) {
            view.setAlpha(1.0f);
            this.f322258g.setTranslationY(0.0f);
            this.f322258g.setTranslationZ(mo102604a(0.0f));
        }
    }

    /* renamed from: c */
    public final void mo102606c() {
        float a = this.f322259h.mo124175a();
        this.f322261j = (int) (a + (this.f322263l * (this.f322260i.mo124175a() - a)));
    }
}
