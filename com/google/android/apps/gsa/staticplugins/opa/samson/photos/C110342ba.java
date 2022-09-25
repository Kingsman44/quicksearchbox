package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4715m.p4716a.p4720b.p4721a.C62683k;
import com.google.p4715m.p4716a.p4720b.p4721a.C62684l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ba */
/* compiled from: PG */
public final /* synthetic */ class C110342ba implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110345bd f307552a;

    public /* synthetic */ C110342ba(C110345bd bdVar) {
        this.f307552a = bdVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C110345bd bdVar = this.f307552a;
        int a = (int) ((C86124t) bdVar.f307557c.mo27525b()).mo79743a(C90014bt.f247140bY);
        boolean z = false;
        if (!C90685b.m148053a(bdVar.f307556b) && ((C86124t) bdVar.f307557c.mo27525b()).mo79746e(C90014bt.f247127bL)) {
            z = true;
        }
        C110318ad adVar = (C110318ad) bdVar.f307559e.mo27525b();
        C62683k kVar = (C62683k) C62684l.f169235h.createBuilder();
        int i = bdVar.f307558d;
        kVar.copyOnWrite();
        C62684l lVar = (C62684l) kVar.instance;
        lVar.f169237a |= 2;
        lVar.f169238b = i;
        kVar.copyOnWrite();
        C62684l lVar2 = (C62684l) kVar.instance;
        lVar2.f169237a |= 4;
        lVar2.f169239c = a;
        kVar.copyOnWrite();
        C62684l lVar3 = (C62684l) kVar.instance;
        lVar3.f169237a |= 128;
        lVar3.f169242f = 5;
        kVar.copyOnWrite();
        C62684l lVar4 = (C62684l) kVar.instance;
        lVar4.f169237a |= 256;
        lVar4.f169243g = !z;
        kVar.copyOnWrite();
        C62684l lVar5 = (C62684l) kVar.instance;
        lVar5.f169237a |= 64;
        lVar5.f169241e = z;
        C60870cx i2 = adVar.f307479f.mo28209i(adVar.f307479f.mo28210j(adVar.mo98570c(), "build req", new C110394x(adVar, (C62684l) kVar.build())), "parse response", C110395y.f307675a);
        bdVar.f307558d += a;
        return i2;
    }
}
