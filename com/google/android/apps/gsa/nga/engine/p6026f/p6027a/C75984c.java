package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76006a;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76008c;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76009d;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76011f;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76012g;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76013h;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76014i;
import com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5131b.C65828de;
import com.google.protos.p5129p.p5131b.C65849r;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.c */
/* compiled from: PG */
public final /* synthetic */ class C75984c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C75989h f210792a;

    public /* synthetic */ C75984c(C75989h hVar) {
        this.f210792a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C65828de deVar;
        C76005x xVar = this.f210792a.f210803f;
        C76014i iVar = (C76014i) C76015j.f210850c.createBuilder();
        for (C65849r rVar : (C58485gu) obj) {
            if (rVar.f179004a == 5) {
                deVar = (C65828de) rVar.f179005b;
            } else {
                deVar = C65828de.f178954b;
            }
            for (String str : deVar.f178956a) {
                if (!C58837ba.m90859h(str)) {
                    C76012g gVar = (C76012g) C76013h.f210845d.createBuilder();
                    C76009d dVar = (C76009d) C76011f.f210841c.createBuilder();
                    dVar.copyOnWrite();
                    C76011f fVar = (C76011f) dVar.instance;
                    str.getClass();
                    fVar.f210843a = 3;
                    fVar.f210844b = str;
                    gVar.copyOnWrite();
                    C76011f fVar2 = (C76011f) dVar.build();
                    fVar2.getClass();
                    ((C76013h) gVar.instance).f210848b = fVar2;
                    C76006a aVar = (C76006a) C76008c.f210836d.createBuilder();
                    aVar.copyOnWrite();
                    ((C76008c) aVar.instance).f210840c = 1;
                    gVar.copyOnWrite();
                    C76013h hVar = (C76013h) gVar.instance;
                    C76008c cVar = (C76008c) aVar.build();
                    cVar.getClass();
                    C62971cq cqVar = hVar.f210849c;
                    if (!cqVar.mo58948c()) {
                        hVar.f210849c = C62942bv.mutableCopy(cqVar);
                    }
                    hVar.f210849c.add(cVar);
                    iVar.copyOnWrite();
                    C76015j jVar = (C76015j) iVar.instance;
                    C76013h hVar2 = (C76013h) gVar.build();
                    hVar2.getClass();
                    jVar.mo72007a();
                    jVar.f210853b.add(hVar2);
                }
            }
        }
        xVar.mo72006e("routine_triggers", (C76015j) iVar.build());
        return C118826c.f331422a;
    }
}
