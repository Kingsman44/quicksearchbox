package com.google.android.libraries.p1969j.p1970a.p1974b;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4184bj.p4193c.p4197c.C55915a;
import com.google.p4184bj.p4193c.p4197c.C55951ay;
import com.google.p4184bj.p4193c.p4197c.C55972h;
import com.google.p4184bj.p4193c.p4197c.C55974j;
import com.google.p4184bj.p4193c.p4197c.C55975k;
import com.google.p4184bj.p4193c.p4197c.C55977m;

/* renamed from: com.google.android.libraries.j.a.b.f */
/* compiled from: PG */
final class C23956f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C23953c f65513a;

    /* renamed from: b */
    final /* synthetic */ C23958h f65514b;

    public C23956f(C23953c cVar, C23958h hVar) {
        this.f65513a = cVar;
        this.f65514b = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C23959i.f65515a.mo56226d()).mo56382g(th)).mo56372aa(47946)).mo56386p("Could not fetch setting text from FPOP");
        C23958h hVar = this.f65514b;
        C23950ah ahVar = C23950ah.ALREADY_CONSENTED;
        hVar.mo29369a();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C23950ah a = C23951ai.m44540a((C55951ay) obj);
        C23953c cVar = this.f65513a;
        C55915a aVar = (C55915a) C55977m.f149067g.createBuilder();
        aVar.copyOnWrite();
        C55977m mVar = (C55977m) aVar.instance;
        mVar.f149070b = 2;
        mVar.f149069a |= 1;
        C55972h hVar = (C55972h) C55975k.f149062c.createBuilder();
        hVar.copyOnWrite();
        C55975k kVar = (C55975k) hVar.instance;
        kVar.f149065b = ((C55974j) C23951ai.f65500a.getOrDefault(a, C55974j.PROMOTABILITY_UNKNOWN)).f149061f;
        kVar.f149064a |= 1;
        aVar.copyOnWrite();
        C55977m mVar2 = (C55977m) aVar.instance;
        C55975k kVar2 = (C55975k) hVar.build();
        kVar2.getClass();
        mVar2.f149073e = kVar2;
        mVar2.f149069a |= 8;
        cVar.mo29365a((C55977m) aVar.build());
        this.f65514b.mo29369a();
    }
}
