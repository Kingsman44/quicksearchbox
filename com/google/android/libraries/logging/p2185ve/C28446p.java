package com.google.android.libraries.logging.p2185ve;

import com.google.common.base.C58838bb;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;

/* renamed from: com.google.android.libraries.logging.ve.p */
/* compiled from: PG */
public final class C28446p {

    /* renamed from: a */
    public final C28440j f77232a = C28442l.m53135a();

    /* renamed from: b */
    public int f77233b;

    /* renamed from: c */
    private final C28480t f77234c = ((C28480t) C28481u.f77286h.createBuilder());

    /* renamed from: a */
    public final C28447q mo33897a() {
        C58838bb.m90884s(this.f77233b != 0, "Semantic events must have a semantic ID.");
        C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
        int i = this.f77233b;
        mVar.copyOnWrite();
        C60214n nVar = (C60214n) mVar.instance;
        nVar.f162916a |= 8;
        nVar.f162918c = i;
        C60214n nVar2 = (C60214n) mVar.build();
        C28480t tVar = this.f77234c;
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        C28481u uVar2 = C28481u.f77286h;
        nVar2.getClass();
        uVar.f77290c = nVar2;
        uVar.f77288a |= 1;
        return new C28447q((C28481u) this.f77234c.build(), this.f77232a.mo33894a());
    }

    /* renamed from: b */
    public final void mo33898b(C28423g gVar) {
        this.f77234c.mo58885m(gVar.f77192a, gVar.f77193b);
    }
}
