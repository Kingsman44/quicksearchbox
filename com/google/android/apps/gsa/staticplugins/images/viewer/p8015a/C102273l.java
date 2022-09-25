package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.protos.p5146w.p5147a.p5148a.C65925c;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65930h;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65948a;
import com.google.protos.p5146w.p5149b.p5157c.p5158a.C65949b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.l */
/* compiled from: PG */
public final /* synthetic */ class C102273l implements C102275n {

    /* renamed from: a */
    public final /* synthetic */ C102276o f285383a;

    public /* synthetic */ C102273l(C102276o oVar) {
        this.f285383a = oVar;
    }

    /* renamed from: a */
    public final C65949b mo93052a(int i) {
        C65926d dVar = this.f285383a.mo93053e().f175200b;
        if (dVar == null) {
            dVar = C65926d.f179289b;
        }
        if (((float) dVar.f179291a.size()) < 12.0f) {
            return C65949b.f179368e;
        }
        C65925c cVar = (C65925c) C65926d.f179289b.createBuilder();
        int i2 = 0;
        while (i2 < 8) {
            i2++;
            int size = ((i2 * 3) + i) % dVar.f179291a.size();
            if (size == i) {
                size = (size + 1) % dVar.f179291a.size();
                i++;
            }
            C65930h hVar = (C65930h) dVar.f179291a.get(size);
            cVar.copyOnWrite();
            C65926d dVar2 = (C65926d) cVar.instance;
            hVar.getClass();
            dVar2.mo59440a();
            dVar2.f179291a.add(hVar);
        }
        C65948a aVar = (C65948a) C65949b.f179368e.createBuilder();
        aVar.copyOnWrite();
        C65949b bVar = (C65949b) aVar.instance;
        C65926d dVar3 = (C65926d) cVar.build();
        dVar3.getClass();
        bVar.f179371b = dVar3;
        bVar.f179370a |= 1;
        return (C65949b) aVar.build();
    }
}
