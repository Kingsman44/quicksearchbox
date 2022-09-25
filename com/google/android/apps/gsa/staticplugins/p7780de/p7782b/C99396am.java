package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89425a;
import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89426b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.am */
/* compiled from: PG */
public final /* synthetic */ class C99396am implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99397an f278067a;

    public /* synthetic */ C99396am(C99397an anVar) {
        this.f278067a = anVar;
    }

    public final void run() {
        C99397an anVar = this.f278067a;
        if (anVar.f278068a.f278114i.mo79659F() == null || !anVar.f278068a.mo91429q()) {
            C99403at atVar = anVar.f278068a;
            C89425a aVar = (C89425a) atVar.f278085E.toBuilder();
            aVar.copyOnWrite();
            C89426b bVar = (C89426b) aVar.instance;
            bVar.f242412a |= 1;
            bVar.f242413b = false;
            atVar.f278085E = (C89426b) aVar.build();
            ((C23251a) anVar.f278068a.f278110e.mo91446l()).mo28730f(anVar.f278068a.f278085E, false);
            return;
        }
        C99403at atVar2 = anVar.f278068a;
        C89425a aVar2 = (C89425a) atVar2.f278085E.toBuilder();
        String F = anVar.f278068a.f278114i.mo79659F();
        aVar2.copyOnWrite();
        C89426b bVar2 = (C89426b) aVar2.instance;
        F.getClass();
        bVar2.f242412a |= 2;
        bVar2.f242414c = F;
        atVar2.f278085E = (C89426b) aVar2.build();
        ((C23251a) anVar.f278068a.f278110e.mo91446l()).mo28730f(anVar.f278068a.f278085E, false);
    }
}
