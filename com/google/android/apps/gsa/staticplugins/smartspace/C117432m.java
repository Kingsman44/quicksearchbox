package com.google.android.apps.gsa.staticplugins.smartspace;

import android.content.Intent;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92110f;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.p7257a.C92025g;
import com.google.android.apps.gsa.staticplugins.smartspace.p8759a.C117341c;
import com.google.android.apps.gsa.staticplugins.smartspace.p8762c.C117356b;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50785ci;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.C50819dp;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.m */
/* compiled from: PG */
public final class C117432m implements C92033ac {

    /* renamed from: a */
    public final C58974d f325946a;

    /* renamed from: b */
    public final C86124t f325947b;

    /* renamed from: c */
    public final C92110f f325948c;

    /* renamed from: d */
    public final C117341c f325949d;

    /* renamed from: e */
    private final C60888db f325950e;

    /* renamed from: f */
    private final C58495hd f325951f;

    /* renamed from: g */
    private final C83794j f325952g;

    /* renamed from: h */
    private final C84469a f325953h;

    public C117432m(C86124t tVar, C90851k kVar, Map map, C117341c cVar, C83564a aVar, C92110f fVar, C83794j jVar, C84469a aVar2) {
        this.f325947b = tVar;
        this.f325950e = kVar.mo85208a("backgroundExecutor");
        this.f325951f = C58495hd.m89898l(map);
        this.f325949d = cVar;
        this.f325946a = aVar.mo76900a("BCSsUpdateIntent");
        this.f325948c = fVar;
        this.f325952g = jVar;
        this.f325953h = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo86686a(C92113i[] iVarArr, C58833ax axVar) {
        if (!this.f325952g.mo77175m()) {
            return C118826c.f331423b;
        }
        if (axVar.mo56113h() || iVarArr.length != 0) {
            C50785ci ciVar = (C50785ci) C50819dp.f132330b.createBuilder();
            ArrayList arrayList = new ArrayList();
            for (C92113i iVar : iVarArr) {
                C58495hd hdVar = this.f325951f;
                C50794cr a = C50794cr.m85938a(iVar.f256820a.f132315l);
                if (a == null) {
                    a = C50794cr.UNDEFINED;
                }
                C117356b bVar = (C117356b) hdVar.getOrDefault(Integer.valueOf(a.f132222T), (C117356b) this.f325951f.get(0));
                if (bVar == null) {
                    C58970a aVar = (C58970a) ((C58970a) this.f325946a.mo56225c()).mo56372aa(32994);
                    C50794cr a2 = C50794cr.m85938a(iVar.f256820a.f132315l);
                    if (a2 == null) {
                        a2 = C50794cr.UNDEFINED;
                    }
                    aVar.mo56389s("No converter find for card type: %s", C92111g.m151146a(a2));
                } else {
                    arrayList.add(bVar.mo103277b(iVar));
                }
            }
            if (axVar.mo56113h()) {
                for (C83802r rVar : (List) axVar.mo56107c()) {
                    if (rVar.mo77094d().mo56113h()) {
                        C58495hd hdVar2 = this.f325951f;
                        C50701am a3 = C50701am.m85887a(((C50738bc) rVar.mo77094d().mo56107c()).f132040g);
                        if (a3 == null) {
                            a3 = C50701am.UNKNOWN;
                        }
                        C117356b bVar2 = (C117356b) hdVar2.getOrDefault(Integer.valueOf(C92025g.m151032a(a3).f132222T), (C117356b) this.f325951f.get(0));
                        if (bVar2 == null) {
                            C58970a aVar2 = (C58970a) ((C58970a) this.f325946a.mo56225c()).mo56372aa(32993);
                            C50701am a4 = C50701am.m85887a(((C50738bc) rVar.mo77094d().mo56107c()).f132040g);
                            if (a4 == null) {
                                a4 = C50701am.UNKNOWN;
                            }
                            aVar2.mo56389s("No converter find for chip type: %s", a4.name());
                        } else {
                            arrayList.add(bVar2.mo103276a(rVar));
                        }
                    }
                }
            }
            return C60922j.m93045h(C60922j.m93044g(C60838bs.m92859i(C60856cj.m92896e(arrayList)), new C117390g(this, this.f325953h.mo78030d(), ciVar), this.f325950e), new C117423h(this), this.f325950e);
        }
        ((C58970a) ((C58970a) this.f325946a.mo56225c()).mo56372aa(32995)).mo56386p("Unable to find the right card to send or chip, abort");
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final C60870cx mo86687b(C92113i[] iVarArr) {
        return mo86686a(iVarArr, C58836b.f156633a);
    }

    /* renamed from: c */
    public final C50818do mo103298c(C50818do doVar) {
        C50733r rVar = doVar.f132316m;
        if (rVar == null) {
            rVar = C50733r.f132021d;
        }
        if ((rVar.f132023a & 2) != 0) {
            try {
                C50733r rVar2 = doVar.f132316m;
                if (rVar2 == null) {
                    rVar2 = C50733r.f132021d;
                }
                Intent parseUri = Intent.parseUri(rVar2.f132025c, 1);
                parseUri.putExtra("com.google.android.apps.search.assistant.verticals.ambient.shared.constants.SMARTSPACE_EXTRA_BLUECHIP_INTENT", true);
                C50790cn cnVar = (C50790cn) doVar.toBuilder();
                C50733r rVar3 = doVar.f132316m;
                if (rVar3 == null) {
                    rVar3 = C50733r.f132021d;
                }
                C50732q qVar = (C50732q) rVar3.toBuilder();
                String uri = parseUri.toUri(1);
                qVar.copyOnWrite();
                C50733r rVar4 = (C50733r) qVar.instance;
                uri.getClass();
                rVar4.f132023a |= 2;
                rVar4.f132025c = uri;
                cnVar.copyOnWrite();
                C50818do doVar2 = (C50818do) cnVar.instance;
                C50733r rVar5 = (C50733r) qVar.build();
                rVar5.getClass();
                doVar2.f132316m = rVar5;
                doVar2.f132304a |= 2048;
                return (C50818do) cnVar.build();
            } catch (URISyntaxException e) {
                ((C58970a) ((C58970a) ((C58970a) this.f325946a.mo56226d()).mo56382g(e)).mo56372aa(32987)).mo56386p("Error parsing intent.");
            }
        }
        return doVar;
    }
}
