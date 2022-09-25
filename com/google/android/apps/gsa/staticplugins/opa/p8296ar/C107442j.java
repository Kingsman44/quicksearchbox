package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.assistant.p3803ag.p3804a.C48876s;
import com.google.assistant.p3803ag.p3804a.C48877t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.j */
/* compiled from: PG */
public final /* synthetic */ class C107442j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f298989a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f298990b;

    /* renamed from: c */
    public final /* synthetic */ C48871n f298991c;

    public /* synthetic */ C107442j(C107458z zVar, C58833ax axVar, C48871n nVar) {
        this.f298989a = zVar;
        this.f298990b = axVar;
        this.f298991c = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107458z zVar = this.f298989a;
        C58833ax axVar = this.f298990b;
        C48871n nVar = this.f298991c;
        C118826c cVar = (C118826c) obj;
        if (C107431k.m178347e(axVar)) {
            C59104x d = C107458z.f299018a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
            ((C59052c) ((C59052c) d).mo56372aa(25366)).mo56386p("storeActiveContent content has been already dismissed exiting ");
            return C118826c.f331423b;
        } else if (cVar == null) {
            C59104x d2 = C107458z.f299018a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
            ((C59052c) ((C59052c) d2).mo56372aa(25365)).mo56386p("storeActiveContent dependencies could not be validated");
            return C118826c.f331423b;
        } else {
            if (C107431k.m178346d(axVar)) {
                C59104x b = C107458z.f299018a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "actionPayloadHandler");
                ((C59052c) ((C59052c) b).mo56372aa(25364)).mo56386p("storeActiveContent updating content in ACTIVE state.");
            }
            C83682a aVar = (C83682a) C83683b.f228105f.createBuilder();
            aVar.copyOnWrite();
            C83683b bVar = (C83683b) aVar.instance;
            nVar.getClass();
            bVar.f228109c = nVar;
            bVar.f228107a |= 2;
            C48851br brVar = nVar.f126473b;
            if (brVar == null) {
                brVar = C48851br.f126412f;
            }
            aVar.copyOnWrite();
            C83683b bVar2 = (C83683b) aVar.instance;
            brVar.getClass();
            bVar2.f228110d = brVar;
            bVar2.f228107a |= 4;
            C48877t tVar = nVar.f126474c;
            if (tVar == null) {
                tVar = C48877t.f126483b;
            }
            int a = C48876s.m85289a(tVar.f126485a);
            if (a == 0) {
                a = 1;
            }
            aVar.copyOnWrite();
            C83683b bVar3 = (C83683b) aVar.instance;
            bVar3.f228111e = a - 1;
            bVar3.f228107a |= 8;
            aVar.copyOnWrite();
            C83683b bVar4 = (C83683b) aVar.instance;
            bVar4.f228108b = 0;
            bVar4.f228107a = 1 | bVar4.f228107a;
            C83683b bVar5 = (C83683b) aVar.build();
            C83693b bVar6 = zVar.f299023f;
            C48851br brVar2 = nVar.f126473b;
            if (brVar2 == null) {
                brVar2 = C48851br.f126412f;
            }
            return zVar.f299021d.mo28210j(bVar6.mo77019e(brVar2.toByteString(), bVar5), "handleShowContentAction#updateContentFuture", new C107450r(zVar, nVar));
        }
    }
}
