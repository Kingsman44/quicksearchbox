package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90226b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90227c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90229e;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.v */
/* compiled from: PG */
public final class C87339v implements C87334q {

    /* renamed from: a */
    public final C90229e f235902a;

    /* renamed from: b */
    public boolean f235903b;

    /* renamed from: c */
    private final C23186f f235904c;

    public C87339v(C23186f fVar, C90229e eVar) {
        this.f235904c = fVar;
        this.f235902a = eVar;
    }

    /* renamed from: e */
    private final boolean m141297e() {
        if (this.f235904c.mo28631l()) {
            return false;
        }
        C90226b bVar = (C90226b) C90227c.f252063c.createBuilder();
        C90229e eVar = this.f235902a;
        bVar.copyOnWrite();
        C90227c cVar = (C90227c) bVar.instance;
        cVar.f252066b = eVar.f252076h;
        cVar.f252065a |= 1;
        this.f235904c.mo28623d(new C23129y("bottomsheet", "bottomsheet"), C23245b.m43556a((C90227c) bVar.build()));
        return true;
    }

    /* renamed from: c */
    public final void mo80980c(C87321d dVar) {
        this.f235904c.mo28626g(new C87336s(this, m141297e(), dVar));
    }

    /* renamed from: d */
    public final void mo80981d(C87321d dVar, int i) {
        m141297e();
        this.f235904c.mo28626g(new C87335r(dVar, i));
    }

    /* renamed from: iy */
    public final void mo80982iy() {
        this.f235903b = true;
        if (this.f235904c.mo28631l()) {
            this.f235904c.mo28626g(C87338u.f235901a);
        }
    }

    /* renamed from: iz */
    public final void mo80983iz() {
        this.f235903b = false;
        if (this.f235904c.mo28631l()) {
            this.f235904c.mo28626g(C87337t.f235900a);
        }
    }
}
