package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83684c;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83685d;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107421a;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107435o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48862e;
import com.google.assistant.p3803ag.p3804a.C48864g;
import com.google.assistant.p3803ag.p3804a.C48865h;
import com.google.assistant.p3803ag.p3804a.C48869l;
import com.google.assistant.p3803ag.p3804a.C48871n;
import com.google.assistant.p3803ag.p3804a.p3805a.C48786f;
import com.google.assistant.p3803ag.p3804a.p3805a.C48787g;
import com.google.assistant.p3803ag.p3804a.p3805a.C48791k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.af */
/* compiled from: PG */
public final class C107394af implements C107389aa {

    /* renamed from: a */
    public static final C59071e f298891a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ar.af");

    /* renamed from: b */
    public final C107435o f298892b;

    /* renamed from: c */
    public final C107421a f298893c;

    /* renamed from: d */
    private final C107441i f298894d;

    /* renamed from: e */
    private final C22871g f298895e;

    /* renamed from: f */
    private final C22871g f298896f;

    /* renamed from: g */
    private final C107441i f298897g;

    /* renamed from: h */
    private final C83693b f298898h;

    public C107394af(C107441i iVar, C22871g gVar, C107435o oVar, C22871g gVar2, C107441i iVar2, C83693b bVar, C107421a aVar) {
        this.f298894d = iVar;
        this.f298895e = gVar;
        this.f298892b = oVar;
        this.f298896f = gVar2;
        this.f298897g = iVar2;
        this.f298898h = bVar;
        this.f298893c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo96000a(C48787g gVar) {
        C59104x b = f298891a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PAPIclient");
        ((C59052c) ((C59052c) b).mo56372aa(25371)).mo56386p("#handleGetContentResponse");
        ArrayList arrayList = new ArrayList();
        for (C48786f fVar : gVar.f126239a) {
            C107441i iVar = this.f298897g;
            C48871n nVar = fVar.f126234a;
            if (nVar == null) {
                nVar = C48871n.f126470e;
            }
            arrayList.add(C118826c.m197213c(iVar.mo96007b(nVar)));
        }
        return C118826c.m197212b(arrayList);
    }

    /* renamed from: b */
    public final C60870cx mo96001b(C48791k kVar) {
        C60870cx cxVar;
        C48862e eVar;
        Object obj;
        C59104x b = f298891a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PAPIclient");
        ((C59052c) ((C59052c) b).mo56372aa(25372)).mo56386p("#handleSyncResponse()");
        C62971cq<C48865h> cqVar = kVar.f126250a;
        ArrayList arrayList = new ArrayList();
        for (C48865h hVar : cqVar) {
            C48864g a = C48864g.m85285a(hVar.f126460d);
            if (a == null) {
                a = C48864g.TYPE_UNSPECIFIED;
            }
            if (a != C48864g.START_JOURNEY) {
                C59104x d = f298891a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PAPIclient");
                C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(25373);
                C48864g a2 = C48864g.m85285a(hVar.f126460d);
                if (a2 == null) {
                    a2 = C48864g.TYPE_UNSPECIFIED;
                }
                cVar.mo56389s("Unexpected top-level action: %s", a2);
            } else {
                if ((hVar.f126457a & 2) != 0) {
                    C22871g gVar = this.f298895e;
                    C83693b bVar = this.f298898h;
                    C83684c cVar2 = (C83684c) C83685d.f228113f.createBuilder();
                    if (hVar.f126458b == 4) {
                        eVar = (C48862e) hVar.f126459c;
                    } else {
                        eVar = C48862e.f126439a;
                    }
                    C62940bt r8 = C62942bv.checkIsLite(C48838be.f126380d);
                    eVar.mo58887l(r8);
                    Object l = eVar.f169962ag.mo58854l(r8.f169971d);
                    if (l == null) {
                        obj = r8.f169969b;
                    } else {
                        obj = r8.mo58889c(l);
                    }
                    C48838be beVar = (C48838be) obj;
                    cVar2.copyOnWrite();
                    C83685d dVar = (C83685d) cVar2.instance;
                    beVar.getClass();
                    dVar.f228117c = beVar;
                    dVar.f228116b = 1;
                    C48869l lVar = hVar.f126461e;
                    if (lVar == null) {
                        lVar = C48869l.f126467a;
                    }
                    cVar2.copyOnWrite();
                    C83685d dVar2 = (C83685d) cVar2.instance;
                    lVar.getClass();
                    dVar2.f228118d = lVar;
                    dVar2.f228115a = 4 | dVar2.f228115a;
                    cVar2.copyOnWrite();
                    C83685d dVar3 = (C83685d) cVar2.instance;
                    dVar3.f228119e = 1;
                    dVar3.f228115a |= 8;
                    cxVar = gVar.mo28210j(bVar.mo77020f((C83685d) cVar2.build()), "Journey stored", new C107390ab(this, hVar));
                } else {
                    cxVar = this.f298894d.mo96006a(hVar);
                }
                C59104x b2 = f298891a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "PAPIclient");
                C59052c cVar3 = (C59052c) ((C59052c) b2).mo56372aa(25375);
                C48864g a3 = C48864g.m85285a(hVar.f126460d);
                if (a3 == null) {
                    a3 = C48864g.TYPE_UNSPECIFIED;
                }
                cVar3.mo56389s("#processClientActionHandleResult() action %s", a3.name());
                C60870cx j = this.f298896f.mo28210j(cxVar, "handleSyncResponse", C107393ae.f298890a);
                C90875ai.m148465b(new C107391ac(this, hVar), j, this.f298895e, "handleSyncResponseResult").mo85223a(new C107392ad(this, hVar));
                arrayList.add(j);
            }
        }
        return C118826c.m197212b(arrayList);
    }
}
