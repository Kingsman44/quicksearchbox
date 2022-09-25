package com.google.android.apps.gsa.nga.engine.understanding.p6235b;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4985f.p5030q.C65196fc;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.b.a */
/* compiled from: PG */
public final /* synthetic */ class C79001a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79002b f217282a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f217283b;

    public /* synthetic */ C79001a(C79002b bVar, C74965n nVar) {
        this.f217282a = bVar;
        this.f217283b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C90048d dVar;
        C90129h hVar;
        C79002b bVar = this.f217282a;
        C74965n nVar = this.f217283b;
        C65196fc fcVar = (C65196fc) obj;
        C61752n nVar2 = fcVar.f176459e;
        if (nVar2 == null || ((nVar2.f166810a & 4) != 0 && (((dVar = (C90048d) C79002b.f217284a.get(nVar2.f166811b)) != null && !bVar.f217286c.mo85405j(dVar)) || ((hVar = (C90129h) C79002b.f217285b.get(nVar2.f166811b)) != null && !C81451b.m129570a(nVar.mo71342q(), bVar.f217286c.mo85403h(hVar)))))) {
            return C58485gu.m89845m();
        }
        C80512a aVar = (C80512a) C80513b.f221014e.createBuilder();
        C80515d dVar2 = C80515d.CANTEEN;
        aVar.copyOnWrite();
        ((C80513b) aVar.instance).f221019d = dVar2.getNumber();
        C61752n nVar3 = fcVar.f176459e;
        if (nVar3 == null) {
            nVar3 = C61752n.f166808f;
        }
        aVar.copyOnWrite();
        nVar3.getClass();
        ((C80513b) aVar.instance).f221016a = nVar3;
        aVar.copyOnWrite();
        ((C80513b) aVar.instance).f221018c = 1.0f;
        return C58485gu.m89846n((C80513b) aVar.build());
    }
}
