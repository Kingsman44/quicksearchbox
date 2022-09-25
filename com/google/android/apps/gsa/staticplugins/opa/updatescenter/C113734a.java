package com.google.android.apps.gsa.staticplugins.opa.updatescenter;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.updatescenter.a */
/* compiled from: PG */
public final /* synthetic */ class C113734a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113742i f314978a;

    /* renamed from: b */
    public final /* synthetic */ C50638an f314979b;

    public /* synthetic */ C113734a(C113742i iVar, C50638an anVar) {
        this.f314978a = iVar;
        this.f314979b = anVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113742i iVar = this.f314978a;
        C50638an anVar = this.f314979b;
        C50638an anVar2 = (C50638an) ((C58833ax) obj).mo56108d(new C113739f(iVar, anVar));
        if (iVar.f314991d.mo26870b() - anVar2.f131731d < TimeUnit.MINUTES.toMillis(iVar.f314992e.mo79743a(C90014bt.f247354fa))) {
            C58976aa aaVar = C58975e.f156826a;
            return C50638an.f131726h;
        }
        if (anVar.f131732e > anVar2.f131732e) {
            C58976aa aaVar2 = C58975e.f156826a;
            iVar.f314989b.mo96360K(anVar);
        } else {
            anVar = anVar2;
        }
        if (Collection.EL.stream(anVar.f131729b).noneMatch(C113740g.f314986a)) {
            C50637am amVar = (C50637am) C50638an.f131726h.createBuilder();
            amVar.mo53412a(anVar.f131730c);
            return (C50638an) amVar.build();
        }
        C50637am amVar2 = (C50637am) anVar.toBuilder();
        amVar2.copyOnWrite();
        C50638an anVar3 = (C50638an) amVar2.instance;
        anVar3.f131728a |= 1;
        anVar3.f131733f = true;
        return (C50638an) amVar2.build();
    }
}
