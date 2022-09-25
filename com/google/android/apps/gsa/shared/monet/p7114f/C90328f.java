package com.google.android.apps.gsa.shared.monet.p7114f;

import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88013ly;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88014lz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88018mc;
import com.google.android.apps.gsa.shared.monet.C90348s;

/* renamed from: com.google.android.apps.gsa.shared.monet.f.f */
/* compiled from: PG */
public final class C90328f extends C90325c {

    /* renamed from: g */
    private final C87680ah f252259g;

    /* renamed from: h */
    private final C90348s f252260h;

    public C90328f(C87680ah ahVar, C90348s sVar) {
        this.f252259g = ahVar;
        this.f252260h = sVar;
    }

    /* renamed from: k */
    private final void m146876k(int i) {
        C88014lz lzVar = (C88014lz) C88018mc.f238019d.createBuilder();
        lzVar.copyOnWrite();
        C88018mc mcVar = (C88018mc) lzVar.instance;
        mcVar.f238022b = i;
        mcVar.f238021a |= 1;
        String str = this.f252260h.f252332a;
        lzVar.copyOnWrite();
        C88018mc mcVar2 = (C88018mc) lzVar.instance;
        str.getClass();
        mcVar2.f238021a |= 2;
        mcVar2.f238023c = str;
        C88489j jVar = new C88489j(C87739bu.MONET_CLIENT_LIFECYCLE_EVENT);
        jVar.mo82014b(C88013ly.f238016a, (C88018mc) lzVar.build());
        this.f252259g.mo81961c(jVar.mo82013a());
    }

    /* renamed from: d */
    public final void mo84012d() {
        super.mo84012d();
        m146876k(6);
    }

    /* renamed from: e */
    public final void mo84013e() {
        super.mo84013e();
        m146876k(3);
    }

    /* renamed from: f */
    public final void mo84014f() {
        super.mo84014f();
        m146876k(2);
    }

    /* renamed from: g */
    public final void mo84015g() {
        super.mo84015g();
        m146876k(5);
    }

    /* renamed from: h */
    public final void mo84016h() {
        super.mo84016h();
        m146876k(1);
    }

    /* renamed from: i */
    public final void mo84017i() {
        super.mo84017i();
        m146876k(4);
    }
}
