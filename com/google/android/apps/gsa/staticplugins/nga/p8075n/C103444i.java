package com.google.android.apps.gsa.staticplugins.nga.p8075n;

import com.google.android.apps.gsa.shared.p6983ah.C89155l;
import com.google.android.apps.gsa.shared.p6983ah.C89156m;
import com.google.android.apps.gsa.shared.p6983ah.C89158o;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.n.i */
/* compiled from: PG */
public final /* synthetic */ class C103444i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103454s f288303a;

    public /* synthetic */ C103444i(C103454s sVar) {
        this.f288303a = sVar;
    }

    public final void run() {
        boolean z;
        C103454s sVar = this.f288303a;
        C89155l lVar = (C89155l) C89156m.f241706i.createBuilder();
        Boolean bool = (Boolean) sVar.f288320d.mo83131e().mo3842a();
        boolean z2 = false;
        if (bool == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        lVar.copyOnWrite();
        C89156m mVar = (C89156m) lVar.instance;
        mVar.f241708a |= 8;
        mVar.f241712e = z;
        boolean b = sVar.mo93789b();
        lVar.copyOnWrite();
        C89156m mVar2 = (C89156m) lVar.instance;
        mVar2.f241708a |= 4;
        mVar2.f241711d = b;
        C89158o oVar = (C89158o) sVar.f288320d.mo83135i().mo3842a();
        if (oVar == null) {
            oVar = C89158o.f241716c;
        }
        lVar.copyOnWrite();
        C89156m mVar3 = (C89156m) lVar.instance;
        oVar.getClass();
        mVar3.f241713f = oVar;
        mVar3.f241708a |= 16;
        Boolean bool2 = (Boolean) sVar.f288320d.mo83134h().mo3842a();
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        }
        lVar.copyOnWrite();
        C89156m mVar4 = (C89156m) lVar.instance;
        mVar4.f241708a |= 2;
        mVar4.f241710c = z2;
        sVar.mo93788a((C89156m) lVar.build());
    }
}
