package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.dh */
/* compiled from: PG */
public final /* synthetic */ class C96158dh implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C96162dl f269181a;

    public /* synthetic */ C96158dh(C96162dl dlVar) {
        this.f269181a = dlVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C96162dl dlVar = this.f269181a;
        C124548d dVar = (C124548d) obj;
        dlVar.f269198n = true;
        C95299e eVar = dlVar.f269188d;
        eVar.f266650e = 0;
        if (eVar.f266649d) {
            C59104x d = C95299e.f266645a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) d).mo56372aa(14857)).mo56389s("session ended already %s", eVar.f266648c);
        }
        C60103kw kwVar = eVar.f266647b;
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        C60106kz kzVar2 = C60106kz.f162531p;
        kzVar.f162533a |= 8;
        kzVar.f162535c = true;
        return dVar;
    }
}
